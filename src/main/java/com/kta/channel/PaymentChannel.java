package com.kta.channel;

import com.kta.dto.OrderDTO;

public interface PaymentChannel {
    void executePayment(OrderDTO orderDTO);
}
