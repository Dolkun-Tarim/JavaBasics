package com.uyghurschool.learnjava.basic;

public class TypeConversionDemo {
    public static void main(String[] args) {
        //widening casting
        //byte -> short -> int -> long -> float -> double
        int x1=100;
        long l1=x1; //no type casting (conversion) is required
        float f1=l1; //no type casting (conversion) is required
        System.out.println(String.format("x1=%d",x1));
        System.out.println(String.format("l1=%d",l1));
        System.out.println(String.format("f1=%.2f",f1));

        //narrowing casting
        //double -> float -> long -> int ->short -> byte (Explicit conversion)
        long x2=20961;
        int i2=(int)x2; //type casting is required
        short s2=(short)i2;
        System.out.println(String.format("x2=%d",x2));
        System.out.println(String.format("i2=%d",i2));
        System.out.printf("s2=%d",s2);

    }
}
