package com.journaldev.spring.di.services;

public class EmailService implements MessageService{

    public boolean sendMessage(String msg, String rec) {
        System.out.println("Email send to" + rec + "with message = " + msg);
        return true;
    }
}
