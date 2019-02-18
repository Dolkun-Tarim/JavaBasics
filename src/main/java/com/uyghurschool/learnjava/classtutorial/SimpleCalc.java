package com.uyghurschool.learnjava.classtutorial;

public class SimpleCalc {

    public double addTwoNumbers(int x1, int x2)
    {
        return x1+x2;
    }

    public double subtractTwoNumbers(int a, int b)
    {
        return a-b;
    }

    public void printInfo(String message)
    {
        System.out.println(message);
    }
    public double addTwoCircleArea(int r1, int r2)
    {
        double result=Math.PI*Math.pow(r1,2)+Math.PI*Math.pow(r2,2);
        System.out.println(String.format("r1=%d r2=%d, area sum %.2f",r1,r2,result));
        return result;
    }

    public int rectangleArea(int width, int length)
    {
        int area=width*length;
        System.out.println(String.format("area of a rectangle %d by %d is %d",width,length,area));
        return area;
    }
}
