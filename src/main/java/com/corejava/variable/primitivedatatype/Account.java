package com.corejava.variable.primitivedatatype;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Account {
    //Satic Variable
    public static final String BANK_NAME = "Citi";
    //instance Variable
    private String accountName;
    private long accountNumber;
    private Customer customer;
    //parameterized Constructor
    public Account(String name, long accNo,String cname,long phone,double balance){
        this.accountName = name;
        this.accountNumber= accNo;
        this.customer = new Customer(cname, phone, balance);

    }
    public void printAccount(){
        log.info(BANK_NAME);
        log.info("Acc Name:"+accountName+ " Acc No:"+accountNumber);
        customer.printCustomer();
    }
}
