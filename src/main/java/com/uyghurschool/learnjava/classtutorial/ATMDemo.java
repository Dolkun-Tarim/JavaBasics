package com.uyghurschool.learnjava.classtutorial;

import java.util.Scanner;

public class ATMDemo {
    public static void main(String[] args) {
        Bank myBank=new Bank();
        myBank.setBankName("US Bank");
        myBank.setAccountNumber(12345678);
        myBank.setAccountBalance(1000);
        double balance=myBank.getAccountBalance();
        System.out.println(myBank.toString());
        Scanner input=new Scanner(System.in);
        System.out.print("Please input the amount to withdraw? ");
        double money=input.nextDouble();
        if(money<balance)
        {
            balance=balance-money;
            myBank.setAccountBalance(balance);
            System.out.println("Balance: "+balance);
        }
        else
        {
            System.out.println("Your balance is not sufficient");
            System.out.println("Please input money less than your balance");
        }

    }
}
