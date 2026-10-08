package com.kta.service;

public interface FatOrderService {
    void placeOnlineOrder(String orderId);
    void processInStorePickup(String orderId);
    void placeWholesaleOrder(String orderId);
}
