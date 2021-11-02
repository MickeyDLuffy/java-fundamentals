package com.company.turntabl;


import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Register {


    private List<Student> nameables;
    private Map<Year, List<Student>> studentsByYear;
    public Register(List<Student> nameables) {
        this.nameables = nameables;
    }

    public List<String> getRegister() {
        return this.nameables
                .stream()
                .map(Nameable::getName)
                .toList();
    }

    public double getHighestGrade() {

        return this.nameables
                .stream()
                .flatMapToDouble(Student::getGrades)
                .max()
                .orElse(0.0);
    }
    public Map<Year, List<Student>> getRegisterByLevel(Year level) {

        return Map.of(Year.FOURTH, List.of(new Student(22, "Test", Year.FOURTH)));
    }

    public String printReport() {
       return "";
    }

    public List<Student> getNameables() {
        return nameables;
    }

    public void setNameables(List<Student> nameables) {
        this.nameables = nameables;
    }

}
