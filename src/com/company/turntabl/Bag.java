package com.company.turntabl;

import java.util.List;

public class Bag<T> {
    private final List<T> students;

    public Bag(List<T> students) {
        this.students = students;
    }
    public void add(T student) {
        students.add(student);
    }

    public boolean remove(T student) {
        students.remove(student);
        return true;
    }

    public boolean clear() {
        students.clear();
        return true;
    }
}
