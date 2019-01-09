package com.uyghurschool.learnjava.datastructure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<String>();
        //add items
        names.add("Bob");
        names.add("Smith");
        names.add("Mike");
        names.add("Jordan");
        int totalNames=names.size();
        System.out.println("Total names: "+totalNames);
        //print items using for each loop
        for(String name: names)
        {
            System.out.print(name+ " , ");
        }
        System.out.println();
        //print items using for loop index
        for(int i=0;i<totalNames;i++)
        {
            System.out.print(names.get(i)+" ,");
        }
        //set 2nd item
        System.out.println();
        names.set(1, "Emily");
        for(String name: names)
        {
            System.out.print(name+ " , ");
        }
        //remove first item from the list
        System.out.println();
        names.remove(0);
        for(String name: names)
        {
            System.out.print(name+ " , ");
        }
        //get specific element
        System.out.println("The second person " + names.get(1));
        //Convert Array to Array List
        System.out.println(" ---- print number -----");
        Integer[] evenNumber=new Integer[]{2,4,6,8,10};
        List<Integer> numberList=new ArrayList<Integer>(Arrays.asList(evenNumber));
        numberList.add(12);
        numberList.add(14);
        numberList.add(100);
        for(int number: numberList)
        {
            System.out.print(number+" ");
        }
    }
}
