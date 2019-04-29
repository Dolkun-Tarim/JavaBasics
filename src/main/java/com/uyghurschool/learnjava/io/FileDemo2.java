package com.uyghurschool.learnjava.io;

public class FileDemo2 {

    public static void main(String[] args) {
        FileUtility fileUtility=new FileUtility();
        String myContent="ئالتە ئاي ئۈگۈنۈپ 100،000 دوللارلىق ئىشقا چىقىش ئۈچۈن قانداق قىلىش كىرەك";
        myContent=myContent+"\n";
        myContent=myContent+"سېلېنىيۇم ماستىر شىركىتىنىڭ 8-ئايلىق تەربىيلەش كۇرسىغا قاتنىشىش كىرەك";
        fileUtility.writeToFile("doc1","myfile",".txt",myContent);
    }
}
