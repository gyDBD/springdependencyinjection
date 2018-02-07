package com.journaldev.spring.di.consumer;
import com.journaldev.spring.di.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component
public class MyApplication {

    private MessageService service;

    @Autowired
    public void setService(MessageService svc) {
        this.service = svc;
    }

    public boolean processMessage(String msg, String rec) {

        return this.service.sendMessage(msg,rec);
    }

}
