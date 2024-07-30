package com.corejava.variable.instancevariable;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

@Log4j2
public class Account {
    //static variable
    public static final String BANK_NAME = "JPMC";
    //instance Variable
    public long accountNo;
    public String accountName;

    public static void main(String[] args) {
        log.info(Account.BANK_NAME);
        //create object
        Account account = new Account();
        account.accountNo = 1001l;
        account.accountName = "Ash";
        System.out.println(account.accountNo+":" +account.accountName);

    }
    }


