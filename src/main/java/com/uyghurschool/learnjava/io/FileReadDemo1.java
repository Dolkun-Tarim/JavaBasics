package com.uyghurschool.learnjava.io;

public class FileReadDemo1 {
    public static void main(String[] args) {
        FileUtility fileUtility=new FileUtility();
       String text1= fileUtility.readTextFile("doc","test1.txt");
       String text2=fileUtility.readTextFile("doc","mydemo.txt");
        System.out.println(text1);
        System.out.println();
        System.out.println(text2);
    }
}
