package com.uyghurschool.learnjava.loop;

public class NestedForLoopDemo {
    public static void main(String[] args) {
        //This is for total rows
        for(int i=0;i<20;i++)
        {
            //This is for columns
            for(int j=0;j<=i;j++)
            {
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}
