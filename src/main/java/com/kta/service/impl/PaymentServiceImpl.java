package com.kta.service.impl;

import com.kta.channel.PaymentChannel;
import com.kta.dto.OrderDTO;
import com.kta.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentServiceImpl implements PaymentService {

    // Violating Open Close Principle

    private final Map<String, PaymentChannel> paymentChannelMap;

    public PaymentServiceImpl(Map<String, PaymentChannel> paymentChannelMap) {
        this.paymentChannelMap = paymentChannelMap;
    }

    @Override
    public void processPayment(OrderDTO orderDTO) {
        String paymentType = orderDTO.getPaymentMethod();

       /* if(paymentType.equals("CC")){
            // offer flat 5% discount
        } else if (paymentType.equals("COD")) {
            // charge .5% extra
        } else {
            // no discounts
        }*/

        PaymentChannel paymentChannel = paymentChannelMap.get(paymentType);
        paymentChannel.executePayment(orderDTO);
    }
}
