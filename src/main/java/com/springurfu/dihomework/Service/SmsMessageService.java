package com.springurfu.dihomework.Service;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class SmsMessageService implements MessageService {

    public SmsMessageService() {
        log.info("SmsMessageService создан");
    }

    @Override
    public String getMessage() {
        return "Сообщение из SmsMessageService";
    }

    @PostConstruct
    public void init() {
        log.info("SmsMessageService инициализирован");
    }

    @PreDestroy
    public void destroy() {
        log.info("SmsMessageService уничтожен");
    }
}
