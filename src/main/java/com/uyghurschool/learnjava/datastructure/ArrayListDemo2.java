package com.uyghurschool.learnjava.datastructure;
import java.util.*;
public class ArrayListDemo2 {
    public static void main(String[] args)
    {
        //find sum and average of an ArrayList
        Integer[] evenNumbers=new Integer[]{16,4,6,8,2,8,10,12};
        List<Integer> numberList=new ArrayList<Integer>();
        //add array to array list
        Collections.addAll(numberList,evenNumbers);
        double totalSum=0;
        for(int number: numberList)
        {
            totalSum=totalSum+number;
        }
        System.out.println("Total sum is: "+totalSum);
        //average=sum/count
        int totalNumbers=numberList.size();
        double average=totalSum/totalNumbers;
        System.out.println("Total numbers: "+totalNumbers);
        System.out.println("Average number is: "+average);
        //fina match
        int i=8;
        int totalMatch=0;
        for(int number: numberList)
        {
            if(number==i)
                totalMatch=totalMatch+1; //totalMatch++
        }
        System.out.println("Total match is "+totalMatch);
        if(totalMatch==0)
        {
            System.out.println("No item is found with the value "+i);
        }
        //find max and min number
        System.out.println(" --- Print max number ---");
        int maxNumber=numberList.get(0);
        for(int j=1;j<totalNumbers;j++)
        {
            int nextNumber=numberList.get(j);
            if(nextNumber>maxNumber)
                maxNumber=nextNumber;
        }
        System.out.println("Max number is "+maxNumber);
        Arrays.sort(evenNumbers);
        System.out.println("The min number" +evenNumbers[0]);
        //print array list
        System.out.println(numberList.toString());
    }
}
