package com.corejava.variable.oops.association.aggregation;

public class TestMain {
    public static void main(String[] args) {
        Engine engine = new Engine(5,"V6");
        Car car = new Car("Red", 4,engine);

        car = null;
        car.getCarDetails();

        System.gc();





    }
}
