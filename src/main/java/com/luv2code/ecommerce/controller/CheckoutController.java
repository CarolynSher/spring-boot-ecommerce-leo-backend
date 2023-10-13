package com.luv2code.ecommerce.controller;


import com.luv2code.ecommerce.entity.Purchase;
import com.luv2code.ecommerce.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    @Autowired
    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public String completePurchase(@RequestBody Purchase purchase) {
            checkoutService.placeOrder(purchase);
            return "Thank you for your order!";

    }


}
