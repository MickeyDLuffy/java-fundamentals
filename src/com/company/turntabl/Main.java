package com.company.turntabl;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

       Student student = new Student(1,     "D Luffy", Year.FIRST);
       Student studentab = new Student(9,     "Sweetie", Year.FIRST);
       Student studentac = new Student(7,     "Deby", Year.SECOND);
       Student student2 = new Student(12,     "Mawuena", Year.SECOND);
       Student student3 = new Student(88,     "Boa", Year.FOURTH);
       Student student43 = new Student(23,     "Luffy", Year.FOURTH);
       Student studentAmatha = new Student(8,     "Amathar", Year.FOURTH);
       Student student4 = new Student(5,     "aSanji", Year.THIRD);
       Student student5 = new Student(4,     "Nico", Year.FIRST);

       List<Student> programmingStudents = List.of(student, studentab, student5);
       List<Student> advancedGardeningStudents = List.of(student4, student3, student43);
       List<Student> physics4thYearStudents =
                Stream.of(student4, student3, student43, new NaughtyStudent(4545, "Blackbeard", Year.FOURTH))
               .filter(student1 -> isVowel(student1.getName()))
               .toList();



       Lecturer louisGamore = new Lecturer("Louis Gamore", Subject.PROGRAMMING);
       Lecturer serwaa = new Lecturer("Empress of Python", Subject.GARDENING);
       Lecturer judith = new Lecturer("Judith of MAths", Subject.PHYSICS);

       Course introToPRogramming = new Course(louisGamore, programmingStudents, Year.FIRST);
       Course advancedGardening = new Course(serwaa, programmingStudents, Year.FOURTH);

       Course physics4Year = new Course(judith, physics4thYearStudents, Year.FOURTH);


    }

   private static boolean isVowel(String alphabet) {
      var firstChar = alphabet.charAt(0);
      return switch (firstChar) {
         case 'a', 'e', 'i', 'o', 'u' -> true;
         default -> false;
      };
   }
}
