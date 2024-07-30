package com.corejava.variable.conditionalstatement;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Language {
    public static final String CODE1= "ENG";
    public static final String CODE2= "SPN";

    /*public String getLanguage(String CODE) {
        if (CODE.equals(CODE1)) {


            return "English";
        } else if (CODE.equals(CODE2)) {
            return "Spanish";

        } else {
            return "Unknown";
        }
    }*/
    // Default Switch
   /* public String getLanguage(String code) {
        switch (code) {
            case "ENG":
                return "English";
            case "SPN":
                return "Spanish";
            default:
                return "Unknown";
        }
    }*/
    // Lambda
   /* public String getLanguage(String code) {
        return switch (code) {
            case "ENG" -> "English";
            case "SPN" -> "Spanish";
            default -> "Unknown";
        };
    }*/
  // Yield
    public String getLanguage(String code){
        return switch (code){
            case CODE1 :
                yield "English";
            case CODE2 :
                yield "Spanish";
            default:
                yield "unknown";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter Code:");
        String CODE = scanner.next();

        Language language = new Language();
        String response = language.getLanguage(CODE);
        log.info("Response:{}",response);
    }

}
