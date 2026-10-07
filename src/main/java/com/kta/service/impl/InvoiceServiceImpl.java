package com.kta.service.impl;

import com.kta.dto.OrderDTO;
import com.kta.service.InvoiceService;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Override
    public void generateInvoice(OrderDTO orderDTO) {
        System.out.println("Generating generateInvoice for order ID: " + orderDTO.getOrderId() +
                ", Billed to: " + orderDTO.getCustomerName() +
                ", Discount: " + orderDTO.getDiscount() +
                ", Total: " + orderDTO.getTotalAmount());
    }
}
