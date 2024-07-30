package com.corejava.variable.primitivedatatype;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class CarEngine {
    public static void main(String[] args) {
        Car car = new Car("Azera",  22.8f,"V6 Limited",134567891011l);
        car.printCar();

    }
}
