package com.uyghurschool.learnjava.datastructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    //Set is unordered collections
    //Set models the mathematical set abstraction
    //A set is a collection that cannot contain duplicate elements
    //Set is an interface, it has its implementations in various
    //classes like HashSet, TreeSet, LinkedHashSet
    public static void main(String[] args) {
        Set<String>  states=new HashSet<String>();
        states.add("Washington DC");
        states.add("Maryland");
        states.add("Virginia");
        states.add("Ohio");
        states.add("New York");
        states.add("New York");
        System.out.println("Total states: "+states.size());
        //iterate set
        Iterator<String> iterator=states.iterator();
        while(iterator.hasNext())
        {
            String state=iterator.next();
            System.out.println(state);
        }
        System.out.println();
        //use for loop to print
        System.out.println(" ----- use for loop to print states");
        for(String state: states)
        {
            System.out.print(state+" ");
        }
        //other operations on set
        Set<Integer> numberSet1=new HashSet<Integer>();
        numberSet1.add(2);
        numberSet1.add(5);
        numberSet1.add(6);
        numberSet1.add(8);
        Set<Integer> numberSet2=new HashSet<Integer>();
        numberSet2.add(2);
        numberSet2.add(6);
        numberSet2.add(20);
        System.out.println(numberSet1.containsAll(numberSet2));
        numberSet1.addAll(numberSet2);
        System.out.println(numberSet1);

    }
}
