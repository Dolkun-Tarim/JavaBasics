package com.uyghurschool.learnjava.classtutorial;

public class Circle extends GraphicObject {
    void draw() {
        System.out.println("I draw a circle");
    }

    void resize() {

        System.out.println("I resized the circle");

    }

    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.x=10;
        circle.y=50;
        circle.draw();
        circle.moveTo(100,200);
        circle.resize();
    }
}
