package com.corejava.exceptionhandling;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class NullPointerExample {

    public static void main(String[] args) {
        NullPointerExample nullPointerExample = new NullPointerExample();
        String output = nullPointerExample.convettouppercase("eswar");
        log.info("Output:{}", output);

    }

    public String convettouppercase(String input){
        String response = null;
        try {
            response = input.toUpperCase();
            log.info("Upper Case Input:{} ",input);
        }catch (NullPointerException e){
            log.error("This is a Null Pointer Exception. Input is Null");
        }


        return response;
    }
}
