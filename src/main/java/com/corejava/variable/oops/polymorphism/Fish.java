package com.corejava.variable.oops.polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Fish implements Animal{
    @Override
    public void move() {
        log.info("Swimming");

    }
}
