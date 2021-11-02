package com.company.turntabl;

import java.util.List;

public class Lecture {
    private List<Student> students;

    public boolean enter(Student student) {
        if(!students.contains(student)) {
           students.add(student);
           return true;
        }
        return false;
    }

    public double getHighestAverageGrade() {
        return students.stream()
                .map(Student::getAverageGrade)
                .mapToDouble(Double::doubleValue)
                .max()
                .orElse(0.0);
    }
}
