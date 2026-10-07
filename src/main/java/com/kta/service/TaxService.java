package com.kta.service;

import com.kta.dto.OrderDTO;
import org.springframework.stereotype.Service;

@Service
public class TaxService {
    public void calculateTax(OrderDTO orderDTO) {
        updateTaxableAmount(orderDTO);
    }

    static void updateTaxableAmount(OrderDTO orderDTO) {
        double taxableAmount = Math.max(0, orderDTO.getAmount() - orderDTO.getDiscount());
        double tax = taxableAmount * 0.18;
        orderDTO.setTax(tax);
        orderDTO.setTotalAmount(taxableAmount + tax);
        System.out.println("Calculating tax for order ID: " + orderDTO.getOrderId() +
                ", Discount: " + orderDTO.getDiscount() +
                ", Tax: " + tax +
                ", Total Amount: " + orderDTO.getTotalAmount());
    }
}
