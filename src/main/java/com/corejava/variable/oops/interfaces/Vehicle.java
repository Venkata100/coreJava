package com.corejava.variable.oops.interfaces;

import lombok.extern.log4j.Log4j2;


public interface Vehicle {
    int No_Of_Doors = 4;

    void engine();

   default void gearbox(){
       System.out.println("Gear Box");
   }
   static void cardetails(){
       System.out.println("CAR DETAILS");
   }
}
