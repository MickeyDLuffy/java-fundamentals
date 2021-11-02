package com.company.turntabl;

public class Lecturer {

    public Subject getSubject() {
        return subject;
    }

    public String getName() {
        return name;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Lecturer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    private String name;
    private Subject subject;
}
