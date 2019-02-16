package com.uyghurschool.learnjava.classtutorial;

import java.util.ArrayList;
import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Dolkun");
        Person person2 = new Person("Dolkun", "Tarim");
        Person person3 = new Person("Alim", "B", "Ehet", "12345678",
                "1234 Main Street", "No.1 School", true);
        List<Person> people = new ArrayList<Person>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        for (Person p : people) {
            System.out.println(p.toString());
        }

    }
}
