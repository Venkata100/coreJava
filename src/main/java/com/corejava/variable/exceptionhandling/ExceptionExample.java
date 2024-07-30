package com.corejava.variable.exceptionhandling;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ExceptionExample {
    public static void main(String[] args) {
        ExceptionExample example = new ExceptionExample();
        int Output = example.divide(10,5);

    }

    public int divide(int input1, int input2){
        int response = input1 / input2;
        log.info("Response:{}", response);
        return response;
    }
}
