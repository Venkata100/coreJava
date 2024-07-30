package com.corejava.variable.oops.association.composition;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Car {
    private String colour;
    private int noOfWheels;

    private final Engine engine;

    public Car( String colour, int noOfWheels, int engineType, String engineModel) {
        this.engine = new Engine(engineType, engineModel);
        this.colour = colour;
        this.noOfWheels = noOfWheels;
    }
    public void getCarDetails(){
        log.info("Colour : {}, No Of Wheels : {}",colour,noOfWheels);
        engine.getEngine();
    }
}
