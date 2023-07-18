package com.felix.vaadintesttask.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Num {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    long num;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long value) {
        this.num = value;
    }
}
