package com.kta.channel.impl;

import com.kta.channel.PaymentChannel;
import com.kta.channel.RefundChannel;
import com.kta.dto.OrderDTO;
import org.springframework.stereotype.Component;

@Component("NetBanking")
public class NetBankingPaymentChannel implements PaymentChannel, RefundChannel {
    @Override
    public void executeRefund(OrderDTO orderDTO) {

    }

    @Override
    public void executePayment(OrderDTO orderDTO) {
        System.out.println("Processing payment via NetBanking for order ID: " + orderDTO.getOrderId() +
                ", Amount: " + orderDTO.getAmount());
    }
}
