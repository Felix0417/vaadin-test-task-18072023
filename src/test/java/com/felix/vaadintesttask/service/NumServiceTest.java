package com.felix.vaadintesttask.service;

import com.felix.vaadintesttask.model.Num;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.felix.vaadintesttask.AppTestData.VALID_NUM;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class NumServiceTest {

    @Autowired
    private NumService service;

    @Test
    void save() {
        Num num = service.save(VALID_NUM);
        Assertions.assertEquals(num.getNum(), VALID_NUM);
    }
}