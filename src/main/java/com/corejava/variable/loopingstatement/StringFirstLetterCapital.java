package com.corejava.variable.loopingstatement;

import java.util.Scanner;

public class StringFirstLetterCapital {

    public static String getFirstLetterCapital(String str){
        char firstletter = Character.toUpperCase(str.charAt(0));
        String remaining= str.substring(1).toLowerCase();
        return firstletter + remaining;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Input: ");
        String input = scanner.next();

        String CapitalFirstLetter = getFirstLetterCapital(input);
        System.out.println("Output: " + CapitalFirstLetter);


    }
}
