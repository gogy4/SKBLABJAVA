package com.springurfu.dihomework.controller;

import com.springurfu.dihomework.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageController {

    private final MessageService emailService;

    @Autowired
    private MessageService smsMessageService;

    private MessageService setterInjectedService;

    public MessageController(MessageService emailMessageService) {
        this.emailService = emailMessageService;
    }

    @Autowired
    public void setSetterInjectedService(MessageService smsMessageService) {
        this.setterInjectedService = smsMessageService;
    }

    public void printMessages() {
        log.info("Constructor DI: " + emailService.getMessage());
        log.info("Field DI: " + smsMessageService.getMessage());
        log.info("Setter DI: " + setterInjectedService.getMessage());
    }
}
