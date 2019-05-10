package com.uyghurschool.learnjava.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CSVWriterDemo2 {
    public static void main(String[] args) {
        StringBuilder mycsv=new StringBuilder();
        mycsv.append("Company Name").append(",").append("CEO").append("\n");
        mycsv.append("Google").append(",").append("Sundar Pichai").append("\n");
        mycsv.append("Facebook").append(",").append("Mark Zuckerberg").append("\n");
        mycsv.append("Microsoft").append(",").append("Satya Nadella");
        File csvFile=new File("docs\\company.csv");
        try {
            FileUtils.write(csvFile,mycsv.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
