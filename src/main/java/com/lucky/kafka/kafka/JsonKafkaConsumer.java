package com.lucky.kafka.kafka;

import com.lucky.kafka.payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class JsonKafkaConsumer {

    @KafkaListener(topics = "javaguides_json", groupId = "myGroup")
    public void consume(User user) {
        log.info("JSON message received -> {}", user);
    }
}
