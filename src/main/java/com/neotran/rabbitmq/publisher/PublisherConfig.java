package com.neotran.rabbitmq.publisher;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PublisherConfig {
    @Value("${consumer.queues.name}")
    private String message;

    @Bean
    public Queue queue() {
        return new Queue(message, true);
    }
}
