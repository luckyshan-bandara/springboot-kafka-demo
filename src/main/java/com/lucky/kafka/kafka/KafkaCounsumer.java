package com.lucky.kafka.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaCounsumer {

    @KafkaListener(topics = "javaguides", groupId = "myGroup")
    public void consume(String message) {
        log.info(String.format("Message received -> %s", message));
    }
}
