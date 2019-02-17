package com.uyghurschool.learnjava.classtutorial;

import java.util.ArrayList;
import java.util.List;

public class StudentInformation {

    private static String version="1.001";

    public static void main(String[] args) {
        GraduateStudent graduateStudent1=new GraduateStudent();
        graduateStudent1.setFirstName("Mike");
        graduateStudent1.setLastName("Smith");
        graduateStudent1.setMiddleInitial("A");
        graduateStudent1.setClassName("Computer Engineering 2012");
        graduateStudent1.setMajor("Computer Programming");
        graduateStudent1.setGender("Male");
        graduateStudent1.setResearchField("Test Automation");
        graduateStudent1.setAdvisorName("Uyghur School");

        GraduateStudent graduateStudent2=
                new GraduateStudent("Maria","John","M",
                        "Test Automation","Computer Programming",
                        "Female","Software","Uyghur School");

        List<GraduateStudent> graduateStudents=new ArrayList<GraduateStudent>();
        graduateStudents.add(graduateStudent1);
        graduateStudents.add(graduateStudent2);
        System.out.println("Total students: "+ graduateStudents.size());
        for(GraduateStudent student: graduateStudents)
        {
            System.out.println(student.toString());
        }


    }
}
