package com.corejava.variable.oops.abstract1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Windows extends Server {


    public Windows(String osType, int model) {
        super(osType, model);
        log.info("Windows Constructor");
    }

    @Override
    public void motherBoard() {
        log.info("Windows MotherBoard");
    }


    public void getWindows() {

    }
}
