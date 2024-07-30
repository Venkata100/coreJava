package com.corejava.variable.method;
import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Calculator1 {
    //Static Method
    public static String getConnection(){
        String str = "ServerConnection";
        return str;
    }

    //Instance Method Subtraction
    public long sub(long input1, long input2){
        long subtraction = input1 - input2;
        return subtraction;
    }

    public static void main(String[] args) {
        String str = Calculator1.getConnection();
        log.info(str);
        Scanner scanner = new Scanner(System.in);
        log.info("Enter the Input:");

        Calculator1 calculator = new Calculator1();
        long response = calculator.sub(scanner.nextLong(),scanner.nextLong());

        log.info(response);
    }

}
