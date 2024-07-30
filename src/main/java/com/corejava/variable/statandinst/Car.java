package com.corejava.variable.statandinst;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Car {
    //Static Variable
public static final String CAR_COMPANY = "Hyundai";
   //Instance Variable
   public String carName;
   public String carModel;
   public long   carIMEI;
   public float  carMileage;

    public static void main(String[] args) {
        log.info(Car.CAR_COMPANY);

        //Create Object
        Car dealer = new Car();
        dealer.carName = "Azera";
        dealer.carModel = "Limited_V6";
        dealer.carIMEI = 1234567891011l;
        dealer.carMileage = 22.8f;
        log.info(dealer.carName+":"+dealer.carModel+":"+dealer.carIMEI+":"+dealer.carMileage);
        //Create Object2
        Car dealer2 = new Car();
        dealer2.carName = "Tuscon";
        dealer2.carModel = "2.5L_Hybrid";
        dealer2.carIMEI = 131415161718l;
        dealer2.carMileage = 35.6f;
        log.info(dealer2.carName+","+dealer2.carModel+","+dealer2.carIMEI+","+dealer2.carMileage);

    }
}

