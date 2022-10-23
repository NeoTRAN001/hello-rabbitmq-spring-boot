package com.neotran.rabbitmq.dummy;

import com.neotran.rabbitmq.publisher.Publisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DummyService {
    @Autowired
    private Publisher publisher;

    public void sendToRabbit(String message) {
        log.info("Message '{}' will be send...", message);

        Data data = new Data(12, message);

        this.publisher.send(data);
    }
}
