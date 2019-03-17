package com.uyghurschool.learnjava.classtutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        try {
            float c = a / b;
            System.out.println(String.format("%d divide by %d is %.2f",a,b,c));
        } catch (Exception e)
        {
            File logFile=new File("error "+System.currentTimeMillis()+".txt");
            PrintWriter writer= null; //define a printer
            try {
                writer = new PrintWriter(logFile);
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
            writer.print(e.getMessage());
            writer.close();
        }
        finally {
            System.out.println(String.format("1st Number %d  2nd Number %d",a,b));
        }


    }
}
