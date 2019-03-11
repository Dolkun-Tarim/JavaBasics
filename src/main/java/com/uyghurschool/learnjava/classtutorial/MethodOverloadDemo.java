package com.uyghurschool.learnjava.classtutorial;

public class MethodOverloadDemo {
    public static void main(String[] args) {
        MethodOverloadDemo demo=new MethodOverloadDemo();
        demo.addNumbers(5,6);
        demo.addNumbers(new int[]{1,4,6,10});
        demo.addNumbers("150","250");
        demo.addNumbers(123L,456L);
    }
    //add two integer numbers
    public int addNumbers(int a, int b)
    {
        int c=a+b;
        System.out.println(String.format("%d+%d=%d",a,b,c));
        return c;
    }
    //add two long numbers
    public long addNumbers(long a, long b)
    {
        long c=a+b;
        System.out.println(String.format("%d+%d=%d",a,b,c));
        return c;
    }
    public double addNumbers(String a, String b)
    {
        double c=Double.parseDouble(a)+Double.parseDouble(b);
        System.out.println(String.format("%s+%s=%.2f",a,b,c));
        return c;
    }
    public int addNumbers(int[] a)
    {
        int s=0;
        for(int i=0;i<a.length;i++)
        {
            s=s+a[i];
        }
        System.out.println("Sum="+s);
        return s;
    }

}
