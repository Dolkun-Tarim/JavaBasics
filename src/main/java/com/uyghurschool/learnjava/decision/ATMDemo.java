package com.uyghurschool.learnjava.decision;

import java.util.Scanner;

public class ATMDemo {
    public static void main(String[] args)
    {
        int accountBalance=2000;
        System.out.println("Please input an amount to withdraw ?");
        Scanner inputAmount=new Scanner(System.in);
        int withdrawAmount=inputAmount.nextInt();
        if(withdrawAmount<accountBalance)
        {
            int balance=accountBalance-withdrawAmount;
            System.out.println("Balance : "+balance);
        }
        else
        {
            System.out.println("You have insufficient fund");
            System.out.println("Your account had "+accountBalance);
        }
    }
}
