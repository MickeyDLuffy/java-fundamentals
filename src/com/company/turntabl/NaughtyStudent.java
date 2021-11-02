package com.company.turntabl;

public class NaughtyStudent extends Student{
    public NaughtyStudent(int ID, String name, Year year) {
        super(ID, name, year);
    }

    @Override
    public double getAverageGrade() {
        return super.getAverageGrade() * 1.1;

    }
}
