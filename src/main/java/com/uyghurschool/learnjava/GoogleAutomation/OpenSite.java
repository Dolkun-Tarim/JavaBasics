package com.uyghurschool.learnjava.GoogleAutomation;

public class OpenSite {
    public static void main(String[] args) {
        Website site1=new Website("https://www.google.com");
        Website site2=new Website("https://www.yahoo.com");
        Thread thread1=new Thread(site1);
        thread1.setName("Google");
        System.out.println("Open Site: "+thread1.getName());
        Thread thread2=new Thread(site2);
        thread2.setName("Yahoo");
        System.out.println("Open site: "+thread2.getName());
        thread1.start();
        thread2.start();
        System.out.println("Thread is active " +thread1.isAlive());
    }
}
