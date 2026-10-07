package com.kta.service;

public interface FatOrderService {
    void placeOnlineOrder(String orderId);
    void processInStorePickup(String orderId);
    void generateDigitalLicense(String orderId);
    void applyWholesaleDiscount(String orderId);
}
