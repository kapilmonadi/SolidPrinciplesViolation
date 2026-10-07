package com.kta.service;

import com.kta.dto.OrderDTO;

public interface TaxService {
    void calculateTax(OrderDTO orderDTO);
}
