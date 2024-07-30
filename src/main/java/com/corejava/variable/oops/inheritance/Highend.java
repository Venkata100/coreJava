package com.corejava.variable.oops.inheritance;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Highend extends BaseModel{
    public Highend(int noOfDoors, int noOfWheels, int noOfModes, int speed) {
        super(noOfDoors, noOfWheels, noOfModes, speed);
    }

    @Override
    public void engine() {
        log.info("HighEnd");
    }
    public void getCarDetails(){
        gearbox("Auto");
        features("Moonroof");
    }
}
