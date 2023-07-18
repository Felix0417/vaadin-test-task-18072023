package com.felix.vaadintesttask.service;

import com.felix.vaadintesttask.model.Num;
import com.felix.vaadintesttask.repository.NumRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class NumService {
    private final NumRepository repository;

    public static final long ID = 1;

    public NumService(NumRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Num save(long value) {
        Num num = get();
        num.setNum(value);
        return repository.save(num);
    }

    public Num get() {
        return repository.findById(ID).orElse(null);
    }
}
