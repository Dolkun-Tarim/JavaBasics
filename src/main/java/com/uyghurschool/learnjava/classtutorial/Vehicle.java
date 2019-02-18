package com.uyghurschool.learnjava.classtutorial;

public class Vehicle {

    private String make;
    private int year;
    private String model;
    private String engine;

    //getter setter constructor

    public Vehicle() {
    }

    public Vehicle(String make, int year, String model, String engine) {
        this.make = make;
        this.year = year;
        this.model = model;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
