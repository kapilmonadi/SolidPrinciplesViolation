package com.kta.service;

import com.kta.dto.OrderDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class NewOrderServiceImpl implements OrderService {
    @Override
    public void placeOrder(OrderDTO orderDTO) {
        System.out.println("This is the new order service !");
    }
}
