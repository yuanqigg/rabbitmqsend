package com.learn.rabbitmq.rabbitmqsend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Configuration
public class RabbitmqsendApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqsendApplication.class, args);
    }

}

