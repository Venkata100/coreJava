package com.corejava.variable.oops.interfaces;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TestMain {
    public static void main(String[] args) {
        PetrolCar petrolCar = new PetrolCar();
        petrolCar.engine();
        petrolCar.gearbox();
        Vehicle.cardetails();

        DieselCar dieselCar = new DieselCar();
        dieselCar.engine();
        dieselCar.gearbox();

        log.info(Vehicle.No_Of_Doors);
    }
}
