package com.ahdev.bookstore.orders;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TestListener {
    @RabbitListener(queues = "#{@newOrdersQueue}")
    public void listen(String message) {
        System.out.println("Received: " + message);
    }
}
