package com.uyghurschool.learnjava.decision;
import java.util.Scanner;
public class DecisionDemo3 {
    public static void main(String[] args) {
        //define a scanner to input grade from the console
        Scanner input=new Scanner(System.in);
        System.out.println("Please input a grade: ");
        int grade=input.nextInt();
        if(grade>=90)
        {
            System.out.println("Your grade is :"+grade);
            System.out.println("Your grade is an A");
        }
        else if(grade>=80 && grade<90)
            System.out.println("Your grade is a B");
        else if(grade>=70 && grade<80)
            System.out.println("Your grade is a C");
        else
            System.out.println("You failed");
    }
}
