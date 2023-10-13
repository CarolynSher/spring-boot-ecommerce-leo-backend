package com.luv2code.ecommerce.service;

import com.luv2code.ecommerce.entity.Purchase;

public interface CheckoutService {

    void placeOrder(Purchase purchase);
}
