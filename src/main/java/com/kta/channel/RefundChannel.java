package com.kta.channel;

import com.kta.dto.OrderDTO;

public interface RefundChannel {
    void executeRefund(OrderDTO orderDTO);
}
