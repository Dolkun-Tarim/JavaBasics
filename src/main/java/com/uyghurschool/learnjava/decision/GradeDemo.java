package com.uyghurschool.learnjava.decision;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
public class GradeDemo {
    public static void main(String[] args) {
        System.out.println("Please input a grade ");
        Scanner input=new Scanner(System.in);
        String grade=input.next();
        System.out.println("You entered: "+grade);
        if(StringUtils.isNumeric(grade))
        {
            int score=Integer.parseInt(grade);
            if(score>=90)
                System.out.println("Your grade is an A");
            else if(score>=80 && score<90)
                System.out.println("Your grade is a B");
            else if (score>=70 && score<80)
                System.out.println("Your grade is a C");
            else
                System.out.println("You failed");
        }
        else
            System.out.println("Please input a valid number");
    }
}
