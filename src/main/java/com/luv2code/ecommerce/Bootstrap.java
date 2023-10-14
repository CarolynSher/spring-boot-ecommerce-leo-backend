package com.luv2code.ecommerce;

import com.luv2code.ecommerce.dao.OrderDetailRepository;
import com.luv2code.ecommerce.dao.OrderRepository;
import com.luv2code.ecommerce.dao.ProductRepository;
import com.luv2code.ecommerce.dao.UserRepository;
import com.luv2code.ecommerce.entity.Product;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;
import java.util.*;

public class Bootstrap implements CommandLineRunner {
    private final UserRepository userRepository;
    private final OrderRepository orderRepository;

    private final ProductRepository productRepository;

    private final OrderDetailRepository orderDetailRepository;

    public Bootstrap(UserRepository userRepository, OrderRepository orderRepository, ProductRepository productRepository, OrderDetailRepository orderDetailRepository) {
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
        this.orderDetailRepository = orderDetailRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        Product product = new Product(5L, "Water", "Bottle of Water", new BigDecimal(5.0), "URL");
        Date currentDate = new Date();
        product.setCreated_at(currentDate);

        Product product2 = new Product(6L,"More water", "case of water", new BigDecimal(12.0),"URL");

        product2.setCreated_at(currentDate);
        productRepository.save(product);
        productRepository.save(product2);

    }

}
