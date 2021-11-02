package com.company.turntabl;

import java.util.List;

public class BagOfStudents {
    private final List<Student> students;

    public BagOfStudents(List<Student> students) {
        this.students = students;
    }

    public void add(Student student) {
        students.add(student);
    }

    public boolean remove(Student student) {
        students.remove(student);
        return true;
    }

    public boolean clear() {
        students.clear();
        return true;
    }

}
