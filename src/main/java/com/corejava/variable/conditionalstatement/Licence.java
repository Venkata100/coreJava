package com.corejava.variable.conditionalstatement;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Licence {
    public static final int MIN_AGE= 18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter the Age:");
        int age = scanner.nextInt();

        Licence licence = new Licence();
        String response = licence.getlicence(age);
        log.info("Response:{}",response);
    }

     public String getlicence(int age){
        if(age > MIN_AGE) {
             return "Eligible";
        }else{
            return "Not Eligible";
        }
        }
     }



