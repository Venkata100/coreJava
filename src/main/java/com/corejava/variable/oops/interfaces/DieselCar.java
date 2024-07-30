package com.corejava.variable.oops.interfaces;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DieselCar implements Vehicle{
    @Override
    public void engine() {
        log.info("Diesel Engine");
    }
}
