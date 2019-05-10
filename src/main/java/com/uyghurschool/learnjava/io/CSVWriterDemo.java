package com.uyghurschool.learnjava.io;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CSVWriterDemo {
    public static void main(String[] args) {
        String filename = "docs\\user-"+System.currentTimeMillis()+".csv";
        try {
            FileWriter fileWriter=new FileWriter(filename); //define a file writer
            BufferedWriter writer=new BufferedWriter(fileWriter);
            CSVPrinter csvPrinter=new CSVPrinter(writer, CSVFormat.DEFAULT.
                    withHeader("First Name","Last Name","Gender","Country"));
            csvPrinter.printRecord("Mike","Smith","Male","Canada");
            csvPrinter.printRecord("Kadir","Kasim","Male","Turkey");
            csvPrinter.printRecord("Flower","Flower","Female","USA");
            csvPrinter.printRecord(Arrays.asList("A","B","C","D"));
            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
