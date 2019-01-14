package com.uyghurschool.learnjava.datastructure;
import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> customers=new LinkedList<Integer>();
        //Add to the tail of the queue
        customers.add(1);
        customers.add(2);
        customers.add(3);
        //print queue
        System.out.println(customers.toString());
        //remove the head
        customers.remove();
        System.out.println(customers.toString());
        //add another customer
        customers.add(4);
        System.out.println(customers.toString());
        //get the head of the queue without removing it
        System.out.println(customers.peek());
        //retrieve and removes the head of the queue
        System.out.println(customers.poll());
        //next customer
        System.out.println(customers.peek());
        //retrieve and removes the head of the queue
        System.out.println(customers.poll());

    }


}
