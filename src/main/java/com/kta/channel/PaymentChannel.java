package com.kta.channel;

import com.kta.dto.OrderDTO;

public interface PaymentChannel {
    void processPayment(OrderDTO orderDTO);
}
