package com.uyghurschool.learnjava.classtutorial;
public class ExceptionDemo  {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        if(b==0)
        {
            System.out.println("Denominator cannot be zero");
        }
        else
        {
            float c=a/b;
            System.out.println(c);
        }

        int[] numbers=new int[]{1,2,3,4,5};
        try {
            System.out.println(numbers[5]);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
