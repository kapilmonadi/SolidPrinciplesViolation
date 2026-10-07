package com.kta.service;

import com.kta.dto.OrderDTO;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public void makePayment(OrderDTO orderDTO) {
        String paymentType = orderDTO.getPaymentMethod();
        if(paymentType.equals("CC")){
            // offer flat 5% discount
        } else if (paymentType.equals("COD")) {
            // charge .5% extra
        }else {
            // no discount
        }
    }
}
