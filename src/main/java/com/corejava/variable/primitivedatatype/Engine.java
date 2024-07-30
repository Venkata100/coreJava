package com.corejava.variable.primitivedatatype;
import lombok.extern.log4j.Log4j2;
@Log4j2

public class Engine {
    // instance Variable
    private String Model;
    private long IMEI;
    //parameterized Constructor

    public Engine(String model,long imei){
        this.Model = model;
        this.IMEI = imei;
    }

    public void printEngine(){
        log.info("EngineModel :"+Model+" EngineImei : "+IMEI);
    }

    }

