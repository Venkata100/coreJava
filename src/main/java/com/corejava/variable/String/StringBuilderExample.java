package com.corejava.variable.String;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StringBuilderExample {

    public static StringBuilder getstring(String str1, String str2) {
        StringBuilder builder = new StringBuilder();
        builder.append(str1);
        builder.append(str2);

        return builder;
    }

//    public static StringBuffer getstrings(String str3, String str4) {
//        StringBuffer buffer = new StringBuffer();
//        buffer.append(str3);
//        buffer.append(str4);
//
//        return buffer;
//    }

    public static void main(String[] args) {
        StringBuilderExample sbe = new StringBuilderExample();
        StringBuilder result = StringBuilderExample.getstring("mad", "max");
         log.info(result);

//        StringBuffer result1 = StringBuilderExample.getstrings("maad", "maxx");
//        log.info(result1);
//        result.toString();

    }
}

