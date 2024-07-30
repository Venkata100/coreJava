package com.corejava.variable.loopingstatement;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class ForLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter Number:");
        int number = scanner.nextInt();

        for(int i= 0; i<=number;i++){
            log.info("value of i:"+i);

        }
        for(int i= number; i>=0;i--){
            log.info("value of i:"+i);

        }
    }



}
