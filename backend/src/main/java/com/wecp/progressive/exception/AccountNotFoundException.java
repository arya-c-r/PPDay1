package com.wecp.progressive.exception;

public class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String msg){
        super(msg);
    }
}