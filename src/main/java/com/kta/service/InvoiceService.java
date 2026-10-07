package com.kta.service;

import com.kta.dto.OrderDTO;

public interface InvoiceService {
    void generateInvoice(OrderDTO orderDTO);
}
