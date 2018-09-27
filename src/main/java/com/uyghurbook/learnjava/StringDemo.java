package com.uyghurbook.learnjava;

public class StringDemo {

    public static void main(String[] args)
    {
        String s1="Uyghur";
        String s2="School";
        //add two strings
        System.out.println(s1+" "+s2);
        //convert string to upper case
        System.out.println(s1.toUpperCase()+" "+s2.toUpperCase());
        //convert String to lower case
        System.out.println(s1.toLowerCase()+" "+s2.toLowerCase());
        //compare two strings
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        //Search in string
        String s="Hello world, this is java string example";
        System.out.println("izdesh netijisi: " +s.contains("world"));
        //replace in String
        System.out.println(s.replace("java","Java"));
        //index of a String
        System.out.println("String index " +s.indexOf("world"));
        //size of the string
        System.out.println("length: "+s.length());
        //get substring
        System.out.println(s.substring(0,11));
        System.out.println(s.substring(12,40));
        //remove space
        String d="     my string    ";
        System.out.println(d);
        System.out.println(d.trim());
    }
}
