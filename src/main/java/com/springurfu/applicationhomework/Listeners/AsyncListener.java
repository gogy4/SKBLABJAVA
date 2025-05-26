package com.springurfu.applicationhomework.Listeners;

import com.springurfu.applicationhomework.events.MyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncListener {

    @Async
    @EventListener
    public void handleAsync(MyEvent event) {
        System.out.println("AsyncListener received: " + event.getMessage());
    }
}