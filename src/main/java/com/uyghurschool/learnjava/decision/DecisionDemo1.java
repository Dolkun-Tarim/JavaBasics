package com.uyghurschool.learnjava.decision;

import java.util.Scanner;

public class DecisionDemo1 {
    public static void main(String[] args) {
        System.out.println("Please input a number");
        Scanner myNumber=new Scanner(System.in);
        int x=myNumber.nextInt();
        if(x%2==0) {

            System.out.println(String.format("%d is an even number", x));
        }
    }
}
