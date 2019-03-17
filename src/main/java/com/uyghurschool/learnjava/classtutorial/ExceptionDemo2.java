package com.uyghurschool.learnjava.classtutorial;

public class ExceptionDemo2 {
    public static void main(String[] args)  {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        try {
            float c = a / b;
            System.out.println(String.format("%d divide by %d is %.2f",a,b,c));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
