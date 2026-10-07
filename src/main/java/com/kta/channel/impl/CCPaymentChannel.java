package com.kta.channel.impl;

import com.kta.channel.PaymentChannel;
import com.kta.dto.OrderDTO;
import org.springframework.stereotype.Component;

@Component("CC")
public class CCPaymentChannel implements PaymentChannel {

    @Override
    public void processPayment(OrderDTO orderDTO) {
        System.out.println("Processing payment via Credit Card (CC) for order ID: " + orderDTO.getOrderId() +
                ", Amount: " + orderDTO.getAmount());
    }
}
