package com.uyghurschool.learnjava.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

@Deprecated
public class FileReadDemo2 {
    public static void main(String[] args) {
        String text= null;
        try {
            text = FileUtils.readFileToString(new File("doc1\\pul-tepish-1556578228265.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(text);
    }
}
