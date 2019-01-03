package com.uyghurschool.learnjava.loop;

public class LoopBreakDemo {
    public static void main(String[] args) {
        for(int i=0;;i++)
        {
            System.out.print(i+" ");
            if(i>=5)
                break;
        }
    }
}
