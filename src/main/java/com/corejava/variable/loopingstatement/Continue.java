package com.corejava.variable.loopingstatement;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            if (i == 5)
                continue;
            System.out.println(i);
        }
    }
}
