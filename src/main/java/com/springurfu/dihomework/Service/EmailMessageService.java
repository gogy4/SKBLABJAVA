package com.springurfu.dihomework.Service;

import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class EmailMessageService implements MessageService {

    public EmailMessageService() {
        log.info("EmailMessageService создан");
    }

    @Override
    public String getMessage() {
        return "Сообщение из EmailMessageService";
    }

    @PostConstruct
    public void init() {
        log.info("SmsMessageService инициализирован");
    }

    @PreDestroy
    public void destroy() {
        log.info("EmailMessageService уничтожен");
    }
}
