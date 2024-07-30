package com.corejava.variable.oops.inheritance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseModel {
    private static final Logger log = LogManager.getLogger(BaseModel.class);
    private int noOfDoors;
    private int noOfWheels;
    private int noOfModes;
    private int speed;

    public BaseModel(int noOfDoors, int noOfWheels, int noOfModes, int speed) {
        this.noOfDoors = noOfDoors;
        this.noOfWheels = noOfWheels;
        this.noOfModes = noOfModes;
        this.speed = speed;

    }

    public void engine(){
        log.info("Base Model");
    }

    public void gearbox(String type){
        log.info("GearBox:{}", type);

    }
    public void gearbox(){
        log.info("GearBox");
    }
    public void features(String feat){
        log.info("features:{}", feat);
    }
}
