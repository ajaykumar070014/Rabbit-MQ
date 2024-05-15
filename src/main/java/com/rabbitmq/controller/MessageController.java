package com.rabbitmq.controller;

import com.rabbitmq.publisher.RabbitMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class MessageController {
    @Autowired
    private RabbitMQProducer producer;

    @GetMapping("/publish")
    private ResponseEntity<String> sendMessage(@RequestParam("message") String message){
        producer.setMessage(message);
        return ResponseEntity.ok("Message sent to RabbitMQ");
    }

}
