package com.uyghurschool.learnjava.io;

public class FileDemo3 {
    public static void main(String[] args) {
        FileUtility fileUtility=new FileUtility();
        String fileContent="ئالتە ئاي ئۈگۈنۈپ، 100،000 دوللارلىق ئىشقا چىقىش ئۈچۈن قانداق قىلىش كىرەك؟";
        fileContent=fileContent+"\n";
        fileContent=fileContent+"سېلېنىيۇم ماستىر شىركىتىنىڭ 8-ئايلىق تەربىيلەش كۇرسىغا قاتنىشىش كىرەك!";
        fileUtility.writeToFile("doc1","pul-tepish",".txt",fileContent);
    }
}
