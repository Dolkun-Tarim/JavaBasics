package com.uyghurschool.learnjava.classtutorial;

public class Motorcycle extends Vehicle{
    private String wheel;

    public Motorcycle() {
    }

    public Motorcycle(String make, int year, String model, String engine, String wheel) {
        super(make, year, model, engine);
        this.wheel = wheel;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                super.toString()+
                "wheel='" + wheel + '\'' +
                '}';
    }
}
