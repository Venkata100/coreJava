package com.corejava.variable.method;
import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2

public class Calculator {
    /*addition
    @params Input1 and Input 2
    return addition
     */
    public long add(long input1, long input2){
        long addition = input1 + input2;
        return addition;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter the Input:");

        Calculator calculator = new Calculator();
        long response = calculator.add(scanner.nextLong(),scanner.nextLong());
        log.info(response);
    }


}
