package com.corejava.variable.oops.inheritance;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TestMain {
    public static void main(String[] args) {
        Highend highend = new Highend(2,4,2,150);
        highend.engine();
        highend.gearbox("Auto");
        highend.features("Moonroof");

        BaseModel baseModel = new BaseModel(4,4,1,100);
        baseModel.engine();
        baseModel.gearbox("Manual");
        baseModel.features("Sunroof");
    }
}
