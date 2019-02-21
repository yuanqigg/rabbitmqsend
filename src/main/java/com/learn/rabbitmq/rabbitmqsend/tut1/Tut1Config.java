package com.learn.rabbitmq.rabbitmqsend.tut1;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Tut1Config {

    @Bean
    public Queue queue() {
        return new Queue("queue");
    }

}
