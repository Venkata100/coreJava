package com.corejava.variable.exceptionhandling;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TryCatchExample {
    public static void main(String[] args) {
        TryCatchExample catchExample = new TryCatchExample();
        int output = catchExample.divide(10,0);


    }

    public int divide(int input1, int input2){
        int response = 0;
        try {
            response = input1/input2;
        }catch(ArithmeticException exception){
            log.error("Cannot divide by Zero", exception);

        }
        log.info("Response:{}",response);
        return response;
    }
}
