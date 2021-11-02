package com.company.turntabl;


import java.util.List;

public class Register {

    private List<Nameable> nameables;

    public Register(List<Nameable> nameables) {
        this.nameables = nameables;
    }

    public List<String> getRegister() {
        return this.nameables
                .stream()
                .map(Nameable::getName)
                .toList();
    }
}
