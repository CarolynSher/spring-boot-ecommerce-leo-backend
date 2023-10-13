package com.luv2code.ecommerce.service;

import com.luv2code.ecommerce.dao.UserRepository;
import com.luv2code.ecommerce.entity.User;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User findById(int id) {
        Long idLong=(long)id;
        Optional<User> result = userRepository.findById(idLong);

        User user = null;

        if (result.isPresent()) {
            user = result.get();
        }
        else {
            throw new RuntimeException("Did not find user id: " + id);
        }

        return user;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);

    }

    @Override
    public void deleteById(int id) {
        Long idLong=(long)id;
        userRepository.deleteById(idLong);
    }


}
