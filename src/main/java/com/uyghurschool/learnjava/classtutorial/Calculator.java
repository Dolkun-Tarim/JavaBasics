package com.uyghurschool.learnjava.classtutorial;


public class Calculator implements  SimpleCalculator, ScientificCalculator {
    public double addTwoNumbers(double a, double b) {
        return a+b;
    }

    public int multiplyTwoNumbers(int x, int y) {
        return x*y;
    }

    public int subtractTwoNumbers(int n1, int n2) {
        return n1-n2;
    }

    public double divideTwoNumbers(double d1, double d2) {
        if(d2==0)
        {
            System.out.println("Denominator cannot be zero");
            return 0;
        }
        else
        {
            return d1/d2;
        }
    }

    public double calculatePower(double base, double power) {
        double calc=Math.pow(base,power);
        System.out.println(String.format("%.2f to the power of %.2f is %.2f",base,power,calc));
        return calc;
    }

    public double calculateSqareRoot(double x) {
       double sr=Math.sqrt(x);
        System.out.println(String.format("Square of of %.2f is %.2f",x, sr));
        return sr;
    }

    public int calculatorRectangleArea(int length, int width) {
        return width*length;
    }
}
