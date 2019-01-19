package com.uyghurschool.learnjava.datatime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

public class DateTimeDemo2 {
    public static void main(String[] args) {
        //define joda date time
        DateTime dt=new DateTime();
        //get current date time using JDK and Joda Time
        Date currentDateTime=dt.toDate();
        System.out.println(currentDateTime);
        //convert JDK to Joda Time
        dt=new DateTime(currentDateTime);
        //get current day
        int dow=dt.dayOfMonth().get();
        System.out.println(dow +" day");
        //add few days
        int daysToAdd=5;
        int newDay=dt.plusDays(daysToAdd).getDayOfMonth();
        System.out.println(newDay+ " day");
        //get day time property
        dt=new DateTime(dt.plusDays(daysToAdd));
        DateTime.Property dDOW=dt.dayOfWeek();
        String shortName=dDOW.getAsShortText();
        String fullName=dDOW.getAsText();
        System.out.println("Full name: "+fullName+ " short name : "+shortName);
        //get month info
        String month=dt.monthOfYear().getAsText();
        System.out.println("Month is "+month);
        int maxDay=dt.dayOfMonth().getMaximumValue();
        System.out.println("Max day: "+maxDay);
        //leap year, era, century, month, day
        boolean leapYear=dt.yearOfEra().isLeap();
        System.out.println("Is leap year: "+leapYear);
        System.out.println("Era is : "+dt.getEra());
        System.out.println("Century is : "+dt.getCenturyOfEra());
        System.out.println("Year is: "+dt.getYear());
        System.out.println("Week is "+dt.getWeekOfWeekyear());
        System.out.println("Month of year: "+dt.getMonthOfYear());
        System.out.println("Day of the year: "+dt.getDayOfYear());
        //format date time
        DateTimeFormatter fmt= DateTimeFormat.forPattern("yyyy-MM-dd");
        String d=dt.toString(fmt);
        System.out.println("Date is in format yyyy-MM-dd" + d);
        //Date Time Zone
        DateTime dt1=new DateTime();
        Date current=dt1.toDate();
        dt1=new DateTime(current);
        DateTimeZone zoneLondon=DateTimeZone.UTC.forID("Europe/London");
        DateTime dtZonLondon=new DateTime(dt1.withZone(zoneLondon));
        System.out.println("Date Time in Lodon zone: "+dtZonLondon);

        DateTimeZone zoneHongKong=DateTimeZone.forID("Asia/Hong_Kong");
        DateTime dtZoneHongKong=new DateTime(dt1.withZone(zoneHongKong));
        System.out.println("Date Time in Hong Kong zone: "+dtZoneHongKong);

    }
}
