package com.uyghurschool.learnjava.datatime;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UnixTimeDemo {
    public static void main(String[] args) {
        //define simple date time format
        DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //define joda time
        DateTime dt=new DateTime();
        Date currentDateTime=dt.toDate();
        System.out.println(currentDateTime);
        //convert current date time to unix format
        try {
            long currentDateTimeEpoch = dateFormat.parse(dateFormat.format(currentDateTime)).getTime();
            System.out.println("Current date time in Unix format " + currentDateTimeEpoch);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        //add 30 days to the date time
        int daysToAdd=30;
        Date newDate=dt.plusDays(daysToAdd).toDate();
        //print new date
        System.out.println("New Date after adding days: "+newDate);
        //convert to unix time
        try {
            long currentDateTimeEpoch = dateFormat.parse(dateFormat.format(newDate)).getTime();
            System.out.println("Current date time in Unix format " + currentDateTimeEpoch);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }

    }
}
