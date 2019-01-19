package com.uyghurschool.learnjava.datatime;

import org.joda.time.DateTime;
import org.joda.time.Duration;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeDemo1 {
    public static void main(String[] args) {
        System.out.println("Current time by nanoseconds: "+System.currentTimeMillis());
        //yyyy-MM-dd-hh-mm-sss
        //Java Date Utility - JDK
        Date date=new Date();
        String pattern="yyyy-MM-dd-hh-mm-sss";
        SimpleDateFormat format=new SimpleDateFormat(pattern);
        System.out.println(format.format(date));
        System.out.println();
        //from Joda to JDK
        DateTime dt=new DateTime();
        //get current date time
        Date jdkDate=dt.toDate();
        //from JDK to joda
        dt=new DateTime(jdkDate);
        System.out.println("Current Date Time : "+dt.toString());

        //get day, month, year
        System.out.println("Day: "+dt.getDayOfMonth());
        System.out.println("Month "+dt.getMonthOfYear());
        System.out.println("Year "+dt.getYear());
        //add or subtract days or months or years
        //add 1 month, add 10 days
        System.out.println();
        System.out.println("Current Date Time : "+dt.toString());
        System.out.println("Add 1 month: "+dt.plusMonths(1));
        System.out.println("Add 10 days: "+dt.plusDays(10));
        //get date time differences
        DateTime d1=new DateTime("2017-10-05");
        DateTime d2=new DateTime("2017-12-05");
        Duration duration=new Duration(d1,d2);
        System.out.println("Difference is : "+duration.getStandardDays());
        System.out.println("Difference is : "+duration.getStandardHours());
    }
}
