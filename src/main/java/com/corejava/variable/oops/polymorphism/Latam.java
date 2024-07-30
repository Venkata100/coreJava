package com.corejava.variable.oops.polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Latam implements Report{
    @Override
    public void generateReport() {
        log.info("Latam Report");
    }
}