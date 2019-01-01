package com.uyghurschool.learnjava.decision;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
public class SwitchDemo2 {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner input=new Scanner(System.in);
        String x=input.next();
        int digitCount=x.length();
        if(StringUtils.isNumeric(x)) {
            switch (digitCount) {
                case 1:
                    System.out.println("This number is less than 9");
                    break;
                case 2:
                    System.out.println("This number is between 10 and 99");
                    break;
                case 3:
                    System.out.println("This number is more than or equal to 100");
                    break;
                default:
                    System.out.println("You entered a number more than 1000");
            }
        }
        else
            System.out.println("Please enter a numeric string");
    }
}
