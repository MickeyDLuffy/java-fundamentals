# java-fundamentals : The code is based on the following questions
This afternoon we're going to model a university. 

1. In a new package, create a class Student.

Each Student has a name, a student ID, and is either in the first, second, third or fourth year.

2. Create a class Lecturer. Each Lecturer has a Name, and either lectures in English Language, Maths, Physics, Programming, or Gardening.

3. Create a class Course. Each course has a Lecturer, a list of Students, and if it is a first, second, third or fourth-year course.

4. In your Main class, create a large number of students, all in different years.

5. Create an Intro to Programming Course for first-year students. Add all your first-year students to the course.

6. Create an Advanced Gardening class (a fourth-year course) and add all your third- and fourth-year students to the course.

7. Create a fourth-year Physics course and add to it all the 4th-year students whose name starts with a vowel.
  # Section 2
1. Create a Student class which accepts a List<Double> as its parameter - these are the students grades. Create a getAverageGrade function and test that it returns the right result.

2. Create a Lecture class. Consider carefully the relationship between Lecture and Student. Create a function on Lecture called Enter, which takes a student as a parameter. Create a function called getHighestAverageGrade and test that it returns the correct result.
  
# section 3 Inheritance
1. Some students have figured out how to hack into the mainframe and increase their grades. Create a NaughtyStudent class for students who know how to increase their reported average grade by 10%.

Write Unit Tests to assert that a NaughtyStudent is a kind of student, and that its reported average grade is 10% higher than it ought to be.

2. Insert a few NaughtyStudents into your lecture. Write some unit tests to assert that a NaughtyStudent is "scoring" higher than everybody else.  

  # Section 3 Abstract Types
1. Create an interface Nameable, which defines a getName() function. Refactor your student class to implement Nameable, and add the appropriate behaviour.

2. Create a new class Register, which has as a constructor parameter a list of Nameable objects. Add a function getRegister which returns a list of Strings, the names of the students. 

Create a unit test to check that your Register functionality does the right thing.
  # Section 4 
1. Create a new interface, HasLevel. This should define a method getLevel() which returns an instance of the Level enum. Have your Student implement the HasLevel interface. The students level should be entered as a constructor parameter and maintained as a private field.

2. Extend your Register class with a method called getRegisterByLevel which takes a Level and returns a list of the names of students studying at that Level.

3. In your Register class, create a function called PrintReport which returns a formatted string of all the names of the students grouped by their Level.
# section 4 Generics and Streams
  1. Refactor your Register class to use Java Streams

2. Add a function to Student that returns their grades as a DoubleStream.

3. Add a function to Register that gets the highest grade of all students' grades.

3. Add a function to find the average of all students grades. Add another function to return the grades of students scoring above 60%.
