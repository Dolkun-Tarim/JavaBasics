package com.uyghurschool.learnjava.classtutorial;

public class Rectangle extends GraphicObject {


    void draw() {
        System.out.println("I draw a rectangle");
    }

    void resize() {
        System.out.println("I resized the rectangle");
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.x=30;
        rectangle.y=50;
        rectangle.draw();
        rectangle.moveTo(rectangle.x+10,rectangle.y+10);
        rectangle.resize();
    }
}
