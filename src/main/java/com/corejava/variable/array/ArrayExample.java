package com.corejava.variable.array;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ArrayExample {

    public static void getStrings() {
        String[] city = new String[4];
        city[0] = "Chennai";
        city[1] = "Mumbai";
        city[2] = "Hyderabad";
        city[3] = "Kochi";

        for (int i = 0; i < city.length; i++) {
            log.info(city[i] + " ");
        }

    }

    public static void getStrings2(){

        String[][] city = {{"Chennai","Mumbai"},
                {"Hyderabad","Kochi"},
                {"Delhi","Goa"}};
        for (int i = 0; i < city.length; i++){
            for (int j =0; j < city[i].length; j++){
                log.info(city[i][j] + " ");
            }

        }
    }

    public static void main(String[] args) {
         getStrings();
        System.out.println();
        getStrings2();



    }
}



