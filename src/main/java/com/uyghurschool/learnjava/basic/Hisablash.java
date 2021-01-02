package com.uyghurschool.learnjava.basic;

public class Hisablash {
    public static void main(String[] args)
    {
        short x=23456;
        int y=45678;
        System.out.println(x+y);
        System.out.println(String.format("%d+%d=%d",x,y,x+y));

        int i1=2147483647;
        long i2=2550483647L;
        long i3=i1+i2;
        System.out.println(String.format("%d+%d=%d",i1,i2,i3));

        double d1=50000.987;
        double d2=12250.55;
        double d3=d1/d2;
        double d4=d1*d2;
        System.out.println(String.format("%.3f/%.2f=%.4f",d1,d2,d3));
        System.out.println(String.format("%.3f*%.2f=%.2f",d1,d2,d4));

    }
}
