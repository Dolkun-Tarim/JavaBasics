package com.uyghurbook.learnjava;

public class ShapeProblem {

    public static void main(String[] args) {

        int r=10;
        double circleArea=Math.PI*r*r;
        System.out.println(String.format("r=%d area=%.2f",r,circleArea));
        double s=Math.PI*Math.pow(r,2);
        System.out.println(String.format("r=%d area=%.2f",r,s));
        System.out.println(Math.random());
        System.out.println(Math.max(100,125));
        System.out.println(Math.min(50,30));

        //solve triangle problem
        int c=15;
        int b=9;
        double a=Math.sqrt(Math.pow(c,2)-b*b);
        System.out.println("a="+a);
        System.out.println(Math.sin(0));



    }
}
