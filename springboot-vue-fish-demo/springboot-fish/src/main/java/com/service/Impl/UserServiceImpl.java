package com.service.Impl;

import com.entity.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper usermapper;

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> selectAll() {
        return null;
    }

    @Override
    public void insert(User user) {

    }
}