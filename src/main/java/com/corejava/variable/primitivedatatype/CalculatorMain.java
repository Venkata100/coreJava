package com.corejava.variable.primitivedatatype;
import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter The Input:");
        Calculator calculator = new Calculator();
        long response = calculator.add(scanner.nextInt(),scanner.nextInt());
        log.info(response);
    }

}
