package com.corejava.variable.oops.abstract1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public abstract class Server {
public static final String IP_ADDRESS = "10.1.0.1;";
private String osType;
private int model;


    public Server(String osType, int model) {
        this.osType = osType;
        this.model = model;
    }

    public void hardDisk(){
        log.info("OS type:{} and model:{}",osType,model );
        log.info(" Hard Disk - Common functionality and common implementation");
    }

    public abstract void motherBoard();
}
