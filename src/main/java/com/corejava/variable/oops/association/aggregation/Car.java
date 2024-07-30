package com.corejava.variable.oops.association.aggregation;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Car {
    private String colour;
    private int noOfWheels;

    private Engine engine;

    public Car(String colour, int noOfWheels, Engine engine) {
        this.colour = colour;
        this.noOfWheels = noOfWheels;
        this.engine = engine;
    }

    public void getCarDetails(){
        log.info("Colour : {}, No Of Wheels : {}",colour,noOfWheels);
        engine.getEngine();
    }
}
