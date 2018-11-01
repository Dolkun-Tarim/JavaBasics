package com.uyghurbook.learnjava;

public class ComparisonOperatorDemo {

    public static void main(String[] args) {
        Number b=10.5;
        System.out.println(b instanceof Double);
        Number i=100;
        System.out.println(i instanceof Integer);
        Object a="1";
        if(a instanceof String)
            System.out.println("Yes, a is String");
        else
        {
            System.out.println("No, a is NOT String");
        }
    }
}
