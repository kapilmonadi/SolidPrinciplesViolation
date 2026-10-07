package com.kta.channel.impl;

import com.kta.channel.PaymentChannel;
import com.kta.dto.OrderDTO;
import org.springframework.stereotype.Component;

@Component("DC")
public class DebitCardChannel implements PaymentChannel {
    @Override
    public void processPayment(OrderDTO orderDTO) {
        System.out.println("Processing payment via Debit Card for order ID: " + orderDTO.getOrderId() +
                ", Amount: " + orderDTO.getAmount());
    }
}
