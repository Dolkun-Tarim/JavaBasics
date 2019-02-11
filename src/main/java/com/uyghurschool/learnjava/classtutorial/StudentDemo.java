package com.uyghurschool.learnjava.classtutorial;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<Student>();
        students.add(new Student("Alim","Ehet","","Computer 2000",
                "Software Engineering","male"));
        students.add(new Student("Dolkun","Tarim","T",
                "Science 1994","Applied Physics","male"));
        Student student=new Student();
        student.setFirstName("Maria");
        student.setLastName("Smith");
        student.setMiddleInitial("A");
        student.setClassName("English Literature");
        student.setGender("female");
        student.setMajor("English");
        students.add(student);
        for(Student s: students)
        {
            System.out.println(s.toString());
        }
    }
}
