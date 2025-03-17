package com.springurfu.dihomework.Service;

import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class EmailMessageService implements MessageService {

    public EmailMessageService() {
        System.out.println("EmailMessageService создан");
    }

    @Override
    public String getMessage() {
        return "Сообщение из EmailMessageService";
    }

    @PostConstruct
    public void init() {
        System.out.println("EmailMessageService инициализирован");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("EmailMessageService уничтожен");
    }
}
