package com.kta.channel.impl;

import com.kta.channel.PaymentChannel;
import com.kta.dto.OrderDTO;
import org.springframework.stereotype.Component;

@Component("COD")
public class CashPaymentChannel implements PaymentChannel {
    @Override
    public void processPayment(OrderDTO orderDTO) {
        System.out.println("Processing order via Cash for order ID: " + orderDTO.getOrderId() +
                ", Amount: " + orderDTO.getAmount());
        System.out.println("Collect the cash at the time of delivery");
    }
}
