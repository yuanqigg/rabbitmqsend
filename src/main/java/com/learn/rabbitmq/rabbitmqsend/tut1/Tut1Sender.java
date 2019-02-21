package com.learn.rabbitmq.rabbitmqsend.tut1;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Tut1Sender{

    @Autowired
    private RabbitTemplate template;

    @Autowired
    private Queue queue;

    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void send() {
        String message = "Hello World !";
        for(int i=0;i<10000;i++){
            this.template.convertAndSend(queue.getName(), message+"[" + i + "]");
        }
    }

}
