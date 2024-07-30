package com.corejava.collection;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;

@Log4j2
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Eswar");
        list.add("Rahul");
        list.add("Sunny");
        list.add("Eswar");
        log.info(list);
    }
}




