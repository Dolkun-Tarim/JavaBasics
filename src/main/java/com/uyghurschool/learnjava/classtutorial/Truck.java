package com.uyghurschool.learnjava.classtutorial;

public class Truck extends Vehicle {

    private String loadCapacity;
    private boolean automaticLoad;

    public Truck() {
    }

    public Truck(String make, int year, String model, String engine, String loadCapacity,
                 boolean automaticLoad) {
        super(make, year, model, engine);
        this.loadCapacity = loadCapacity;
        this.automaticLoad = automaticLoad;
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public boolean isAutomaticLoad() {
        return automaticLoad;
    }

    public void setAutomaticLoad(boolean automaticLoad) {
        this.automaticLoad = automaticLoad;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity='" + loadCapacity + '\'' +
                ", automaticLoad=" + automaticLoad +
                '}';
    }
}
