package com.springurfu.dihomework.Service;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class SmsMessageService implements MessageService {

    public SmsMessageService() {
        System.out.println("SmsMessageService создан");
    }

    @Override
    public String getMessage() {
        return "Сообщение из SmsMessageService";
    }

    @PostConstruct
    public void init() {
        System.out.println("SmsMessageService инициализирован");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("SmsMessageService уничтожен");
    }
}
