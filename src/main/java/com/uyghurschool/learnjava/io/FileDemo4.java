package com.uyghurschool.learnjava.io;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileDemo4 {
    public static void main(String[] args) {
        StringBuilder myString=new StringBuilder();
        myString.append("This is line 1").append("\n");
        myString.append("This is line 2").append("\n");
        myString.append("This is line 3").append("\n");
        myString.append("Welcome to Uyghur School").append("\n");
        myString.append(1234);
        File myFile=new File("docs\\test2.txt");
        try {
            FileUtils.writeStringToFile(myFile,myString.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
