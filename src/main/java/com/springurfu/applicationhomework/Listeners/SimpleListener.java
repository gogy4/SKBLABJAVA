package com.springurfu.applicationhomework.Listeners;

import com.springurfu.applicationhomework.events.MyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SimpleListener {
    @EventListener
    public void handleEvent(MyEvent event) {
        System.out.println("Simple Event received: " + event);
    }
}
