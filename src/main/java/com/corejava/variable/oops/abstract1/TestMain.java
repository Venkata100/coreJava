package com.corejava.variable.oops.abstract1;

public class TestMain {
    public static void main(String[] args) {
        Windows windows = new Windows("Win 11", 2024);
        windows.hardDisk();
        windows.getWindows();
        windows.motherBoard();

        Mac mac = new Mac("M4",2024);
        mac.hardDisk();
        mac.getMac();
        mac.motherBoard();
    }
}
