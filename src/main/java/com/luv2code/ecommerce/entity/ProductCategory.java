package com.luv2code.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name="product_category")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="category_name")
    private String categoryName;

}
