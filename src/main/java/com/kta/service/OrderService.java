package com.kta.service;

import com.kta.dto.OrderDTO;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public void placeOrder(OrderDTO orderDTO) {
        // validateOrder(orderDTO);
        makePayment(orderDTO);
        saveOrder(orderDTO);
        calculateTax(orderDTO);
        generateInvoice(orderDTO);
        sendNotification(orderDTO);
    }

    private void makePayment(OrderDTO orderDTO) {
        System.out.println("Processing makePayment for order ID: " + orderDTO.getOrderId() +
                ", Amount: " + orderDTO.getAmount() +
                ", Payment Method: " + orderDTO.getPaymentMethod());
    }

    private void saveOrder(OrderDTO orderDTO) {
        System.out.println("Saving order to saveOrder: " + orderDTO.getOrderId() +
                " for customer: " + orderDTO.getCustomerName());
    }

    private void calculateTax(OrderDTO orderDTO) {
        double taxableAmount = Math.max(0, orderDTO.getAmount() - orderDTO.getDiscount());
        double tax = taxableAmount * 0.18;
        orderDTO.setTax(tax);
        orderDTO.setTotalAmount(taxableAmount + tax);
        System.out.println("Calculating tax for order ID: " + orderDTO.getOrderId() +
                ", Discount: " + orderDTO.getDiscount() +
                ", Tax: " + tax +
                ", Total Amount: " + orderDTO.getTotalAmount());
    }

    private void generateInvoice(OrderDTO orderDTO) {
        System.out.println("Generating generateInvoice for order ID: " + orderDTO.getOrderId() +
                ", Billed to: " + orderDTO.getCustomerName() +
                ", Discount: " + orderDTO.getDiscount() +
                ", Total: " + orderDTO.getTotalAmount());
    }

    private void sendNotification(OrderDTO orderDTO) {
        String phoneInfo = orderDTO.getPhoneNumber() != null ? ", Phone: " + orderDTO.getPhoneNumber() : "";
        System.out.println("Sending sendNotification email to: " + orderDTO.getCustomerEmail() +
                phoneInfo + " for order ID: " + orderDTO.getOrderId());
    }
}
