package com.uyghurschool.learnjava;

public class ArgumentDemo {

    public static void main(String[] args)
    {
        int x1=Integer.parseInt(args[0]);
        int x2=Integer.parseInt(args[1]);
        int x3=Integer.parseInt(args[2]);
        System.out.println(String.format("%d+%d+%d=%d",x1,x2,x3,x1+x2+x3));
        System.out.printf("%d*%d*%d=%d",x1,x2,x3,x1*x2*x3);
    }
}
