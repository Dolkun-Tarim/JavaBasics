package com.uyghurschool.learnjava.datastructure;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args)
    {
        int[] numbers=new int[10];  //numbers array has 10 elements; all elements are initialized with zero
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        numbers[1]=10;
        System.out.println(numbers[1]);
        //String array example
        String[] names=new String[4]; //all elements are initialized with null
        System.out.println(names[0]);
        names[0]="Mike";
        names[1]="Robert";
        names[2]="Smith";
        names[3]="Selenium";
        System.out.println("Total names: "+names.length);
        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
        System.out.println(" --------------- ----- ");
        //using for each loop
        for(String s: names)
        {
            System.out.println(s);
        }
        System.out.println("--------------------------");
        //sorting in array
        numbers=new int[]{1,5,3,2,15,15,17,20,4,6};
        Arrays.sort(numbers); //sorting array
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+" ");
        }
        System.out.println(" ---------------");
        //from big to small
        for(int j=numbers.length-1;j>=0;j--)
        {
            System.out.print(numbers[j]+ " ");
        }
    }
}
