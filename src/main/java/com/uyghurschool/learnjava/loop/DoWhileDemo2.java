package com.uyghurschool.learnjava.loop;

public class DoWhileDemo2 {
    public static void main(String[] args) {
        int totalMilesToRun=0;
        int timePerMile=15;
        int timeToRest=5;
        int targetMile=25;
        int totalMinutesToRun=0;
        do {
            totalMilesToRun++;
            totalMinutesToRun=totalMinutesToRun+timePerMile;
            if(totalMilesToRun<targetMile)
                totalMinutesToRun=totalMinutesToRun+timeToRest;
            System.out.println("Miles: "+totalMilesToRun);
            System.out.println("Minutes: "+totalMinutesToRun);
        }while (totalMilesToRun<targetMile);
        System.out.println("Total Minutes: "+totalMinutesToRun);
    }
}
