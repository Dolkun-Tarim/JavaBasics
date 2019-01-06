package com.uyghurschool.learnjava.datastructure;

public class ArrayDemo1 {
    public static void main(String[] args)
    {
        int[] numbers=new int[]{2,5,10,30,40,100,3, 5, 10,15}; //n-1
        System.out.println("total numbers: "+numbers.length);
        System.out.print(numbers[0]+" ");
        System.out.print(numbers[1]+" ");
        System.out.print(numbers[2]+" ");
        System.out.print(numbers[3]+" ");
        System.out.print(numbers[4]+" ");
        System.out.print(numbers[5]+" ");
        System.out.print(numbers[6]+" ");
        System.out.print(numbers[7]+" ");
        System.out.print(numbers[8]+" ");
        System.out.print(numbers[9]+" ");
        numbers[9]=200;
        System.out.println(numbers[9]);
        // use index number
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        //use for each loop
        for(int n: numbers)
        {
            System.out.print(n+" ");
        }

    }
}
