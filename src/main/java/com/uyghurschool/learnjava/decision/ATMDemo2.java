package com.uyghurschool.learnjava.decision;

import java.util.Scanner;

public class ATMDemo2 {
    public static void main(String[] args) {
        int accountBalance=5000;
        System.out.print("Please input an amount to withdraw ");
        Scanner inputAmount=new Scanner(System.in);
        int withdrawAmount=inputAmount.nextInt();
        System.out.println(
                (withdrawAmount<accountBalance)?"Balance "+(accountBalance-withdrawAmount):
                "You have insufficient fund \n"+ "Your account had "+accountBalance);
    }
}
