package com.felix.vaadintesttask.web;

import com.felix.vaadintesttask.service.NumService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("")
public class MainRoute extends VerticalLayout {

    private final NumberField numberField;

    private final NumService service;

    private Long num;

    @Autowired
    public MainRoute(NumService service) {
        this.service = service;
        num = service.get().getNum();
        numberField = new NumberField("Value");
        numberField.setValue((double) num);
        numberField.setStep(1);
        Button button = new Button("Iterate value!", buttonClickEvent -> compareAndSet());
        setJustifyContentMode(JustifyContentMode.CENTER);
        setAlignItems(Alignment.CENTER);
        add(numberField, button);
    }

    private void compareAndSet() {
        long currentValue = numberField.getValue().intValue();
        if (currentValue != num) {
            num = currentValue;
            Notification.show("New value saved");
        } else {
            num++;
            Notification.show("Value incremented");
        }
        numberField.setValue((double) service.save(num).getNum());
    }
}
