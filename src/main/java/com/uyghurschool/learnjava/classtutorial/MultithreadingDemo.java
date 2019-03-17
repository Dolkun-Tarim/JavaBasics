package com.uyghurschool.learnjava.classtutorial;

public class MultithreadingDemo {
    public static void main(String[] args) {
        GreetingPrinting g1=new GreetingPrinting("Hello Uyghur School");
        GreetingPrinting g2=new GreetingPrinting("Java Multi-Threading is fun");
        GreetingPrinting g3=new GreetingPrinting("Multi Threading");
        Thread thread1=new Thread(g1);
        System.out.println("Thread Id "+thread1.getId());
        Thread thread2=new Thread(g2);
        System.out.println("Thread Id "+thread2.getId());
        Thread thread3=new Thread(g3);
        System.out.println("Thread Id "+thread3.getId());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
