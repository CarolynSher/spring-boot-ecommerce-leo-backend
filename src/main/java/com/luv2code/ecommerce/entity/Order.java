package com.luv2code.ecommerce.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @Column(name="total_price")
    private BigDecimal total_price;

    @Column(name="created_at")
    @CreationTimestamp
    private Date created_at;

    @ManyToOne
    @JoinColumn(name="order_detail_id")
    private OrderDetail orderDetail;

    public Order() {
    }

    public Order(Long id, User user, BigDecimal total_price) {
        this.id = id;
        this.user = user;
        this.total_price = total_price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getTotal_price() {
        return total_price;
    }

    public void setTotal_price(OrderDetail orderDetail) {
        this.total_price = orderDetail.totalPrice();
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }
}









