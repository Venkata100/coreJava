package com.corejava.variable.loopingstatement;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Input: ");
        String input = scanner.next();

        String reverse = new StringBuilder(input).reverse().toString();
        System.out.println(reverse);
    }

}
