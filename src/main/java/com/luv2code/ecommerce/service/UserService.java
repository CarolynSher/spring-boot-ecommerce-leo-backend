package com.luv2code.ecommerce.service;

import com.luv2code.ecommerce.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(int id);

    void save(User user);

    void deleteById(int id);


}
