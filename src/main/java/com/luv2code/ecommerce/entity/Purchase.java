package com.luv2code.ecommerce.entity;

import com.luv2code.ecommerce.entity.Address;
import com.luv2code.ecommerce.entity.User;
import com.luv2code.ecommerce.entity.Order;


public class Purchase {

    private User user;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;

    public Purchase() {
    }

    public User getUser() {
        return user;
    }

    public void setCustomer(User user) {
        this.user = user;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }


}
