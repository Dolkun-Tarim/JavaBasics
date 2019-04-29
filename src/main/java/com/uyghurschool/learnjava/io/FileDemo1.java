package com.uyghurschool.learnjava.io;

public class FileDemo1 {
    public static void main(String[] args) {
        FileUtility fileUtility=new FileUtility();
        String myContent="This is a text file";
        myContent=myContent+"\n"+"This is a second line";
        fileUtility.writeToFile("doc1","myfile",".txt",myContent);
    }
}
