package com.uyghurschool.learnjava.loop;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class ForLoopDemo2 {
    public static void main(String[] args) {
        System.out.print("Please input an integer: ");
        Scanner input=new Scanner(System.in);
        int end=input.nextInt();
        int sumEven=0;
        int sumOdd=0;
        for(int i=1;i<=end;i++)
        {
            if(i%2==0) {
                sumEven = sumEven + i;
                System.out.println(String.format("i=%d sum=%d",i,sumEven));
            }
            else{
                sumOdd=sumOdd+i;
                System.out.println(String.format("i=%d sum=%d",i,sumOdd));
            }


        }
        System.out.println("Sum Even: "+sumEven);
        System.out.println("Sum Odd: "+sumOdd);
    }
}
