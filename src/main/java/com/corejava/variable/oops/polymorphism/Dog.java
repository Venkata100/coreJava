package com.corejava.variable.oops.polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Dog implements Animal {
    @Override
    public void move() {
        log.info("Running");

    }
}
