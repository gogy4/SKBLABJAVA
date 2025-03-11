package com.springurfu.dihomework.controller;

import com.springurfu.dihomework.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageController {

    private final MessageService emailService; // DI через конструктор

    @Autowired
    @Qualifier("smsMessageService") // DI через поле, указание конкретного бина
    private MessageService smsService;

    private MessageService setterInjectedService; // DI через сеттер

    // DI через конструктор с @Qualifier для явного указания, какой бин использовать
    @Autowired
    public MessageController(@Qualifier("emailMessageService") MessageService emailService) {
        this.emailService = emailService;
    }

    @Autowired
    public void setSetterInjectedService(@Qualifier("smsMessageService") MessageService setterInjectedService) {
        this.setterInjectedService = setterInjectedService;

    }

    public void printMessages() {
        System.out.println("Constructor DI: " + emailService.getMessage());
        System.out.println("Field DI: " + smsService.getMessage());
        System.out.println("Setter DI: " + setterInjectedService.getMessage());
    }
}
