package com.corejava.variable.loopingstatement;

public class NestedLoop {


    public static void main(String[] args) {
        // Outer loop for the number of lines
        for (int i = 1; i <= 5; i++) {
            // Inner loop for printing numbers in each line
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Print a new line after each row
            System.out.println();
        }
    }
}
