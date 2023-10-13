package com.luv2code.ecommerce.service;

import com.luv2code.ecommerce.dao.OrderRepository;
import com.luv2code.ecommerce.dao.UserRepository;
import com.luv2code.ecommerce.entity.OrderDetail;
import com.luv2code.ecommerce.entity.Purchase;
import com.luv2code.ecommerce.entity.User;
import com.luv2code.ecommerce.entity.Order;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class CheckoutServiceImpl implements CheckoutService {

    private UserRepository userRepository;
    private OrderRepository orderRepository;

    public CheckoutServiceImpl(UserRepository userRepository, OrderRepository orderRepository) {
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    @Transactional
    public void placeOrder(Purchase purchase) {

        Order order = purchase.getOrder();

        OrderDetail orderDetail = order.getOrderDetail();

        User user = purchase.getUser();

        order.setUser(user);

        orderRepository.save(order);
    }

}









