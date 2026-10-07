package com.kta.service;

import com.kta.dto.OrderDTO;

public interface NotificationService {
    void sendNotification(OrderDTO orderDTO);
}
