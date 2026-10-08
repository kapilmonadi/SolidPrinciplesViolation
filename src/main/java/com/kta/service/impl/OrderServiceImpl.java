package com.kta.service.impl;

import com.kta.dto.OrderDTO;
import com.kta.service.*;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class OrderServiceImpl implements OrderService {

    private final PaymentService paymentService;
    private final OrderRepository orderRepository;
    private final TaxService  taxService;
    private final InvoiceService invoiceService;
    private final NotificationService notificationService;

    public OrderServiceImpl(PaymentService paymentService, OrderRepository orderRepository, TaxService taxService, InvoiceService invoiceService, NotificationService notificationService) {
        this.paymentService = paymentService;
        this.orderRepository = orderRepository;
        this.taxService = taxService;
        this.invoiceService = invoiceService;
        this.notificationService = notificationService;
    }

    @Override
    public void placeOrder(OrderDTO orderDTO) {
        orderRepository.saveOrder(orderDTO);
        taxService.calculateTax(orderDTO);
        invoiceService.generateInvoice(orderDTO);
        paymentService.processPayment(orderDTO);
        notificationService.sendNotification(orderDTO);
    }
}
