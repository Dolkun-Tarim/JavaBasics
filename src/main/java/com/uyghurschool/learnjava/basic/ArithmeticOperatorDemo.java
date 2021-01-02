package com.uyghurschool.learnjava.basic;

public class ArithmeticOperatorDemo {
    public static void main(String[] args) {
        //+ - *  / %
        int a=5;
        int b=10;
        int c=a+b;
        System.out.println(String.format("%d +%d=%d",a,b,c));
        String s1="Uyghur";
        String s2="Java";
        System.out.println(s1+s2);

        int i1=100;
        int i2=20;
        int i3=i1-i2;
        System.out.println(String.format("%d-%d=%d",i1,i2,i3));

        double d1=10.50;
        double d2=20.20;
        double d3=d1*d2;
        System.out.println(String.format("%.2f*%.2f=%.2f",d1,d2,d3));

        int j1=7;
        int j2=4;
        int j3=j1/j2;
        double j4=(double)j1/j2;
        System.out.println(String.format("%d/%d=%d",j1,j2,j3));
        System.out.println(String.format("%d/%d=%f",j1,j2,j4));

        int j5=j1%j2; //remainder
        System.out.println(j1+"%"+j2+"="+j5);
        int x1=8;
        int x2=4;
        int x3=x1%x2;
        System.out.println(x1+"%"+x2+"="+x3);
    }
}
