package com.corejava.variable.constructor;
import com.corejava.variable.method.DBConnection;
import lombok.extern.log4j.Log4j2;

@Log4j2

public class Account {
    //static variable
    public static final String BANK_NAME = "Citi";
    //instance variable
    public long accountNo;
    public String accountName;

    //defaultConstructor
    public Account(){
        this.accountNo= 123456789l;
        this.accountName = "Ash";
    }

    /*Parametrized Constructor
    @ params accountNo,accountName*/
    public Account(long num,String name){
        this.accountNo= num;
        this.accountName= name;
    }
    public Account(String name, long num){
        this.accountNo = num;
        this.accountName= name;
    }

    public static void main(String[] args) {
        Account account = new Account();
        log.info(account.accountNo+":"+account.accountName);
        Account account1 = new Account(123456789l,"Ash");
        log.info(account1.accountNo+":"+account1.accountName);
        Account account2 = new Account("Ashen",12345678900l);
        log.info(account2.accountNo+":"+account2.accountName);


    }



}


