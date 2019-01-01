package com.uyghurschool.learnjava.decision;

import java.util.Scanner;

public class NestedIfDemo {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        if(x>0)
        {
            System.out.println("You entered a positive number "+x);
            if(x%2==0)
                System.out.println(x+ " is an even number");
            else
                System.out.println(x+ " is an odd number");
        }
        else
            System.out.println("Please enter a positive number");
    }
}
