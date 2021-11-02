package com.company.turntabl;

import javax.annotation.processing.Generated;
import java.io.Serial;
import java.util.List;
import java.util.Random;

public class Student {
    private String name;
    private int ID;
    private Year year;

    private List<Double> grades;



    public Student(int ID, String name, Year year) {
        this.name = name;
        this.year = year;
        this.ID = ID;
    }

    public void addGrades(List<Double> grades) {
        this.grades = grades;
    }

    public double getAverageGrade() {
        return this.grades.stream()
                .mapToDouble(Double::doubleValue)
                .average().orElse(0.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }




}
