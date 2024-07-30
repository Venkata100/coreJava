package com.corejava.variable.primitivedatatype;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Customer {
    //instance Variable
    private String CName;
    private  long phone;
    private double balance;
    //Parameterized Constructor
    public Customer(String cname,long phone,double balance){
        this.CName= cname;
        this.phone= phone;
        this.balance= balance;

    }
    public void printCustomer(){
        log.info("Customer Name:"+CName+ " Customer Phone:"+phone+ " Customer Balance:"+balance);
    }
}
