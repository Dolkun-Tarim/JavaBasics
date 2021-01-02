package com.uyghurschool.learnjava.basic;

public class BooleanDemo2 {
    public static void main(String[] args) {
        int number1=5;
        int number2=10;
        //conditional operator AND (&&) OR (||)
        boolean result=(number1==5)&&(number2==9);
        System.out.println(result);
        System.out.println((0<100)&&(200<100));
        System.out.println((0<100)||(200<100));

    }
}
