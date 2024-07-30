package com.corejava.variable.oops.association.aggregation;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Engine {

    private int engineType;
    private String engineModel;

    public Engine(int engineType, String engineModel) {
        this.engineType = engineType;
        this.engineModel = engineModel;
    }

    public void getEngine(){
        log.info("Engine Type : {}, Engine Model : {}", engineType,engineModel);
    }
}
