package com.uyghurschool.learnjava.loop;

public class WhileDemo {
    public static void main(String[] args) {
        double balance=5000;
        double targetBalance=30000;
        int year=0;
        double rate=0.05;
        while(balance<targetBalance)
        {
            year++; //year=year+1
            double interest=rate*balance;
            balance=balance+interest;
            System.out.println(String.format("Year %d Interest %.2f Balance %.2f",year,interest,balance));
        }
        System.out.println(String.format("Total year: %d",year));
        System.out.println(String.format("Final balance %.2f",balance));
    }
}
