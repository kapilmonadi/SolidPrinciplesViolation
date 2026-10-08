package com.kta.channel.impl;

import com.kta.channel.PaymentChannel;
import com.kta.channel.RefundChannel;
import com.kta.dto.OrderDTO;
import org.springframework.stereotype.Component;

@Component("UPI")
public class UPIPaymentChannel implements PaymentChannel, RefundChannel {
    @Override
    public void executePayment(OrderDTO orderDTO) {
        System.out.println("This is UPI channel");
    }

    @Override
    public void executeRefund(OrderDTO orderDTO) {

    }
}
