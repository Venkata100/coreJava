package com.corejava.variable.localvariable;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Car {
    //Static Variable
    public static final String CAR_COMPANY = "Audi";
    //instance Variable
    public String carModel;
    public float carMileage;

    // Default Constuctor
    public Car() {
        this.carModel = "A3";
        this.carMileage = 22.8f;
    }

    // Parameterized Constuctor
    public Car(String model, float mileage) {
        this.carModel = model;
        this.carMileage = mileage;
    }

    public Car(float mileage, String model) {
        this.carMileage = mileage;
        this.carModel = model;
    }

    public static void main(String[] args) {
        //local Variable
        long Imei = 1234567891011l;
        long Imei1 = 10111213141516l;
        log.info(CAR_COMPANY);
        Car car = new Car();
        log.info(car.carModel + ":" + car.carMileage + ":" + Imei);
        Car car1 = new Car("A6",16.8f);
        log.info(car1.carModel+":"+car1.carMileage+":"+Imei1);
    }

}
