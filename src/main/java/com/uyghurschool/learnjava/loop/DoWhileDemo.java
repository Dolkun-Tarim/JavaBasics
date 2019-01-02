package com.uyghurschool.learnjava.loop;

public class DoWhileDemo {
    public static void main(String[] args) {
        double balance=1000;
        double targetBalance=2000;
        int year=0;
        double rate=0.05;
        do {
            year++;
            double interest=balance*rate;
            balance=balance+interest;
            System.out.println(String.format("Year %d Interest %.2f Balance %.2f",year,
                    interest,balance));
        }while(balance<targetBalance);
        System.out.println("Total year: "+year);
        System.out.println("Final balance : "+balance);
    }
}
