package com.uyghurschool.learnjava.basic;

public class RelationalOperatorDemo {
    public static void main(String[] args) {
        int value1=10;
        int value2=9;
        //relational operator returns boolean type
        System.out.println(value1==value2);
        System.out.println(value1!=value2); //true
        System.out.println(value1>value2);
        System.out.println(value1<value2);
        System.out.println("apple"=="apple");
        System.out.println("Apple"=="apple");
        System.out.println(value1!=value2);
        double d1=10.50;
        double d2=10.49;
        System.out.println(d1>=d2);
        System.out.println(d1<=d2);
    }
}
