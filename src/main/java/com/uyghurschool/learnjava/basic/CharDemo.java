package com.uyghurschool.learnjava.basic;

public class CharDemo {

    public static void main(String[] args)
    {
        String s1="I am an Uyghur";
        System.out.println(s1.indexOf("I"));
        char firstLetter=s1.charAt(0);
        //I ni besip chiqirish
        System.out.println(firstLetter);
        //r ni besip chiqirish
        System.out.println(s1.charAt(s1.indexOf("r")));
    }
}
