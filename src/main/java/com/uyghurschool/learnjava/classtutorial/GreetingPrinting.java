package com.uyghurschool.learnjava.classtutorial;

import java.util.Date;

public class GreetingPrinting implements Runnable {
    private String greetingMessage;
    public GreetingPrinting(String greetingMessage)
    {
        this.greetingMessage=greetingMessage;
    }
    public void run() {
        for(int i=1;i<=5;i++)
        {
            Date now=new Date();
            System.out.println(now +"   "+greetingMessage);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
