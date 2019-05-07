package com.uyghurschool.learnjava.io;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
public class CsvReadDemo {

    public static void main(String[] args) {
        //define a file reader object
        Reader inputFile=null;
        try {
            inputFile=new FileReader("doc\\userinfo.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Iterable<CSVRecord> records= CSVFormat.RFC4180.withHeader("First Name","Last Name","Gender","Country")
                    .parse(inputFile);
            for(CSVRecord record:records)
            {
                String firstName=record.get("First Name");
                String lastName=record.get("Last Name");
                String gender=record.get("Gender");
                String country=record.get("Country");
                System.out.printf("%s, %s, %s, %s",firstName,lastName,gender,country);
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
