package com.uyghurschool.learnjava.classtutorial;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<StudentObject> studentObjects =new ArrayList<StudentObject>();
        studentObjects.add(new StudentObject("Alim","Ehet","","Computer 2000",
                "Software Engineering","male"));
        studentObjects.add(new StudentObject("Dolkun","Tarim","T",
                "Science 1994","Applied Physics","male"));
        StudentObject studentObject =new StudentObject();
        studentObject.setFirstName("Maria");
        studentObject.setLastName("Smith");
        studentObject.setMiddleInitial("A");
        studentObject.setClassName("English Literature");
        studentObject.setGender("female");
        studentObject.setMajor("English");
        studentObjects.add(studentObject);
        for(StudentObject s: studentObjects)
        {
            System.out.println(s.toString());
        }
    }
}
