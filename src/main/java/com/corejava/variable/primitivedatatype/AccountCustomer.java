package com.corejava.variable.primitivedatatype;

import lombok.extern.log4j.Log4j2;


public class AccountCustomer {
    public static void main(String[] args) {
     Account account = new Account("Savings", 525252454546l, "Ash", 9998882211l, 500000);
     account.printAccount();
    }
}
