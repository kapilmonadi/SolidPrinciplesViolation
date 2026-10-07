package com.kta.channel.impl;

import com.kta.channel.PaymentChannel;
import com.kta.dto.OrderDTO;
import org.springframework.stereotype.Component;

@Component
public class CCPaymentChannel implements PaymentChannel {
    @Override
    public void processPayment(OrderDTO orderDTO) {

    }
}
