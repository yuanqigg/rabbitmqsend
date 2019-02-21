package com.learn.rabbitmq.rabbitmqsend.tut1;

import com.learn.rabbitmq.rabbitmqsend.RabbitmqsendApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes= RabbitmqsendApplication.class)
@RunWith(SpringRunner.class)

public class TestRabbitMQ {

    @Autowired
    private Tut1Sender tut1Sender;

    @Test
    public void testRabbit() {
        tut1Sender.send();
    }

}