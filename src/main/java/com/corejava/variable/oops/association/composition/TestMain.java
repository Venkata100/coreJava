package com.corejava.variable.oops.association.composition;

public class TestMain {
    public static void main(String[] args) {
        Car car = new Car("Blue",4,2,"V6");

       car = null;
        car.getCarDetails();

       System.gc();


    }
}
