package com.kta.service;

import com.kta.channel.PaymentChannel;
import com.kta.dto.OrderDTO;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentService {

    private final  Map<String, PaymentChannel> paymentChannelMap;

    public PaymentService(Map<String, PaymentChannel> paymentChannelMap) {
        this.paymentChannelMap = paymentChannelMap;
    }

    // Violating Open Close Principle
    public void makePayment(OrderDTO orderDTO) {
        String paymentType = orderDTO.getPaymentMethod();

        if(paymentType.equals("CC")){
            // offer flat 5% discount
        } else if (paymentType.equals("COD")) {
            // charge .5% extra
        } else {
            // no discounts
        }
    }

    public void makePaymentNew(OrderDTO orderDTO) {
        String paymentType = orderDTO.getPaymentMethod();
        PaymentChannel paymentChannel = paymentChannelMap.get(paymentType);
        if(paymentChannel == null){
            throw new RuntimeException("Payment channel cannot be null");
        }
        paymentChannel.processPayment(orderDTO);
    }
}
