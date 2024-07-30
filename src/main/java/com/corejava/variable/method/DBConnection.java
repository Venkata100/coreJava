package com.corejava.variable.method;
import lombok.extern.log4j.Log4j2;
@Log4j2

public class DBConnection {
    //variable
    //constructor
    //method
    public static void getConnection(){
        log.info("DBConnection");
    }
    public static String getConnection1(){
        String str = "DBConnection";
        return str;
    }

    public static void main(String[] args) {
        DBConnection.getConnection();
        String str = DBConnection.getConnection1();
        log.info(str);
    }



}
