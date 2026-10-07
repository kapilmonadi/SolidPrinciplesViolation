package com.kta.service;

import com.kta.dto.OrderDTO;

public interface PaymentService {
    void makePayment(OrderDTO orderDTO);
}
