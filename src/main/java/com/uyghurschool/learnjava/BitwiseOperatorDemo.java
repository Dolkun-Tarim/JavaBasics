package com.uyghurschool.learnjava;

public class BitwiseOperatorDemo {
    public static void main(String[] args) {
        byte a=100;
        byte b=110;
        //boolean OR operation
        byte c=(byte)(a|b);
        //boolean AND operation
        byte d=(byte)(a&b);
        System.out.println("Boolean or operation: "+c);
        System.out.println("Boolean AND operation: "+d);
    }
}
