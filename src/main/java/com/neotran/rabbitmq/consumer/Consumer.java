package com.neotran.rabbitmq.consumer;

import com.neotran.rabbitmq.dummy.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer {
    @RabbitListener(queues = { "${consumer.queues.name}" })
    public void receive(@Payload Data message) {
        log.info("Received message {}", message);
    }

    private void makeSlow() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
