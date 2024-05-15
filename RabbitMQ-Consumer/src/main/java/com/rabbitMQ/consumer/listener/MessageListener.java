package com.rabbitMQ.consumer.listener;

import com.rabbitMQ.consumer.config.MQConfig;
import com.rabbitMQ.consumer.dto.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage customMessage){
        System.out.println(customMessage);
    }
}
