package com.uyghurschool.learnjava.classtutorial;

public class MethodOverridingDemo {
    public static void main(String[] args) {
        //use Class A
        ClassA classA=new ClassA();
        classA.printMessage();
        System.out.println(classA.calc(10,5));
        System.out.println("----------------------------------");
        ClassA myClass=new ClassB();
        myClass.printMessage();
        System.out.println(myClass.calc(10,5));

    }
}
