package com.uyghurschool.learnjava.datastructure;
import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> books=new Stack<String>();
        books.push("book1");
        books.push("book2");
        books.push("book3");
        //print stack
        System.out.println(books.toString());
        //removes the top of the stack
        String top=books.pop();
        System.out.println("The book in the stack is "+top);
        System.out.println(books.toString());
        //get the top of the stack without removing it
        String head=books.peek();
        System.out.println("Current book in the stack "+head);
        System.out.println(books.toString());
        //add a new book
        books.push("new book");
        String topBook=books.peek();
        System.out.println("The book on the top is "+topBook);
        System.out.println(books.toString());
        //search
        System.out.println(books.search("book1"));
    }
}
