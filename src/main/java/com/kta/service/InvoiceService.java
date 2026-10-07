package com.kta.service;

import com.kta.dto.OrderDTO;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

    public void generateInvoice(OrderDTO orderDTO) {
        System.out.println("Generating generateInvoice for order ID: " + orderDTO.getOrderId() +
                ", Billed to: " + orderDTO.getCustomerName() +
                ", Discount: " + orderDTO.getDiscount() +
                ", Total: " + orderDTO.getTotalAmount());
    }
}
