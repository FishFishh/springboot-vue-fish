package com.service;

import com.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    List<User> selectAll();

    void insert(User user);
}
