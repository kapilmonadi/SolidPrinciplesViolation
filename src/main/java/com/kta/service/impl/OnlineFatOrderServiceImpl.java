package com.kta.service.impl;

import com.kta.service.FatOrderService;

public class OnlineFatOrderServiceImpl implements FatOrderService {
    @Override
    public void placeOnlineOrder(String orderId) {
        System.out.println("Online order placed for order # " + orderId);
    }

    @Override
    public void processInStorePickup(String orderId) {
        throw new UnsupportedOperationException("In store pickup not supported");
    }

    @Override
    public void placeWholesaleOrder(String orderId) {
        throw new UnsupportedOperationException("wholesale order not supported");
    }
}
