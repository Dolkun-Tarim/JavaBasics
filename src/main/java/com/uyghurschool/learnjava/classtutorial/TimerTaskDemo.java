package com.uyghurschool.learnjava.classtutorial;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskDemo  {
    public static void main(String[] args) {
        TimerTask task=new TimerTask() {
            int i=0;
            @Override
            public void run() {
                //task to run goes here
                System.out.println("Hello Uyghur School!!! " + new Date());
                i=i+1;
                if(i>10)
                {
                    System.exit(0);
                }
            }
        };
        Timer timer=new Timer();
        long delay=0;
        long intervalPeriod=2*1000;
        // Schedule the task to run in an interval of 2 seconds
        timer.scheduleAtFixedRate(task,delay,intervalPeriod);

    }
}
