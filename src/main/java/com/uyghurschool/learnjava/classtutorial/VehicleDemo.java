package com.uyghurschool.learnjava.classtutorial;

public class VehicleDemo {
    public static void main(String[] args) {
        Truck truck=new Truck();
        truck.setMake("Volvo");
        truck.setYear(2012);
        truck.setModel("Volvo S1");
        truck.setLoadCapacity("30 Ton");
        truck.setAutomaticLoad(true);
        System.out.println(String.format("%s %d %s %s %s",truck.getMake(),truck.getYear(),
                truck.getModel(),truck.getLoadCapacity(),truck.isAutomaticLoad()));

        Motorcycle motorcycle=new Motorcycle("Suzuke",2015,"Suzuke S1","2.6 L","2 Weels");
        System.out.println(motorcycle.toString());

    }
}
