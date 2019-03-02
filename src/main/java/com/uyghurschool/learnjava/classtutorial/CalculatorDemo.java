package com.uyghurschool.learnjava.classtutorial;

public class CalculatorDemo {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator=new Calculator();
        double sum=simpleCalculator.addTwoNumbers(10,50);
        System.out.println(sum);

        ScientificCalculator scientificCalculator=new Calculator();
        scientificCalculator.calculatePower(3,3);
        scientificCalculator.calculateSqareRoot(16);
    }
}
