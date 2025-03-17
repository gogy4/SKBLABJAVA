package com.springurfu.dihomework;

import com.springurfu.dihomework.controller.MessageController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApplication implements CommandLineRunner {

    private final MessageController messageController;

    public DiApplication(MessageController messageController) {
        this.messageController = messageController;
    }

    public static void main(String[] args) {
        SpringApplication.run(DiApplication.class, args);
    }

    @Override
    public void run(String... args) {
        messageController.printMessages();
    }
}
