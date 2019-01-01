package com.uyghurschool.learnjava.decision;

import java.util.Scanner;

public class DecisionOperatorDemo {
    public static void main(String[] args) {
        System.out.println("Please input x1:");
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        System.out.println("Please input x2: ");
        int x2 = input.nextInt();
        int z = x1 > x2 ? x1 : 0;
        System.out.println("z=" + z);
        if(x1>x2)
            z=x1;
        else
        { z=0;}
        System.out.println("z="+z);

    }
}
