package com.corejava.variable.primitivedatatype;
import lombok.extern.log4j.Log4j2;
@Log4j2

public class Car {
    public static final String CAR_COMPANY = "Hyundai";
    //Instance Variable
    private String carName;
    private float  carMileage;
    private Engine engine;

    // Parameterized Constructor
    public Car(String name, float mileage,String model,long imei){
        this.carName= name;
        this.carMileage= mileage;
        this.engine = new Engine(model, imei);

    }
    public void printCar(){
        log.info(CAR_COMPANY);
        log.info("Car Name:"+carName+" Car Mileage:"+carMileage);
        engine.printEngine();
    }
}
