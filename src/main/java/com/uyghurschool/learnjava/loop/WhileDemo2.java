package com.uyghurschool.learnjava.loop;

import org.apache.commons.lang3.StringUtils;

public class WhileDemo2 {
    public static void main(String[] args) {
        if(args==null||args.length<1|| !StringUtils.isNumeric(args[0])
        ||!StringUtils.isNumeric(args[1]))
            System.out.println("Please enter balance and target balance argument");
        else
        {
            double balance=Double.parseDouble(args[0]);
            double targetBalance=Double.parseDouble(args[1]);
            int year=0;
            double rate=0.05;
            while(balance<targetBalance)
            {
                year=year+1;
                double interest=balance*rate;
                balance=balance+interest;
                System.out.printf("Year %d Interest %.2f  Balance %.2f",year,interest,balance);
                System.out.println();
            }
            System.out.println("Total year: "+year);
            System.out.println("Final balance : "+balance);
        }
    }
}
