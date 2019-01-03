package com.uyghurschool.learnjava.loop;

public class ForLoopDemo1 {
    public static void main(String[] args) {
        int sum1=0;
        for(int i=1;i<=10;i++)
        {
            sum1=sum1+i;
            System.out.println(String.format("i=%d   sum=%d",i,sum1));
        }
        System.out.println("Total sum: "+sum1);

        int sum2=0;
        for(int i=1;i<=100;i++)
        {
            sum2=sum2+i;
            System.out.println(String.format("i=%d   sum=%d",i,sum2));
        }
        System.out.println("Total sum: "+sum2);
    }
}
