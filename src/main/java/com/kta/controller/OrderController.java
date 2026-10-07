package com.kta.controller;

import com.kta.dto.OrderDTO;
import com.kta.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping({"/placeOrderWtihViolation"})
    public ResponseEntity<String> placeOrderWithViolation(@RequestBody OrderDTO orderDTO) {
        orderService.placeOrder(orderDTO);
        return ResponseEntity.ok("Order placed successfully via placeOrderViolation");
    }
}
