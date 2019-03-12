package com.uyghurschool.learnjava.classtutorial;

public abstract class GraphicObject {
    int x;
    int y;
    //define a method with implementation
    void moveTo(int newX, int newY)
    {
        System.out.println(String.format("This object is moved to location %d, %d",newX,newY));
    }
    //define abstract methods
    abstract void draw();
    abstract void resize();
}
