package com.corejava.variable.oops.abstract1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Mac extends Server {


    public Mac(String osType, int model) {
        super(osType, model);
        log.info("Mac Constructor");
    }

    @Override
    public void motherBoard() {
        log.info("Mac MotherBoard");

    }

    public void getMac(){

    }
}
