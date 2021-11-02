package com.company.turntabl;

import java.util.List;

public class Course {
    private Lecturer lecturer;
    private List<Student> students;
    private Year year;
    private Subject subject;


    public Course(Lecturer lecturer, List<Student> students, Year year) {
        this.lecturer = lecturer;
        this.students = students;
        this.year = year;
    }

    public void addStudent(List<Student> students) {

        this.students
        .addAll(students.stream()

                .filter(student -> student.getYear().equals(Year.FOURTH))
//                .filter(student -> isVowel(student.getName()))
                .toList());

    }




    @Override
    public String toString() {
        return "Course{" +
                "lecturer=" + lecturer +
                ", students=" + students +
                ", year=" + year +
                '}';
    }
}
