package com.uyghurschool.learnjava.loop;

public class LoopContinueDemo {
    public static void main(String[] args) {
        for(int j=0;j<=20;j++)
        {
            if(j>=10)
                continue;
            System.out.print(j+" ");
        }
    }
}
