package com.kta.channel.impl;

import com.kta.channel.PaymentChannel;
import com.kta.dto.OrderDTO;
import org.springframework.stereotype.Component;

@Component("NetBanking")
public class NetBankingPaymentChannel implements PaymentChannel {

    @Override
    public void executePayment(OrderDTO orderDTO) {
        System.out.println("Processing payment via NetBanking for order ID: " + orderDTO.getOrderId() +
                ", Amount: " + orderDTO.getAmount());
    }
}
