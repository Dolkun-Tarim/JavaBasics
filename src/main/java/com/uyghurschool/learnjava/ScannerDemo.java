package com.uyghurschool.learnjava;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner myInput=new Scanner(System.in);
        System.out.print("Please input the first number: ");
        int x1=myInput.nextInt();
        System.out.print("Please input the second number: ");
        int x2=myInput.nextInt();
        int sum=x1+x2;
        System.out.println(String.format("%d+%d=%d",x1,x2,sum));
        //
        Scanner input1=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        System.out.print("Input1=");
        int a=input1.nextInt();
        System.out.print("Input2=");
        int b=input2.nextInt();
        System.out.println(String.format("%d*%d=%d",a,b,a*b));

    }
}
