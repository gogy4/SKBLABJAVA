package com.springurfu.applicationhomework.Listeners;

import com.springurfu.applicationhomework.events.MyEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class TransactionalListener {
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void handleTransactional(MyEvent event) {
        System.out.println("TransactionalListener received (after commit): " + event.getMessage());
    }
}
