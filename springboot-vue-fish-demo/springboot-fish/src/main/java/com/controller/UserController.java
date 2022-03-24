package com.controller;

import com.entity.Result;
import com.entity.User;
import com.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping
    public Result<?> sava(@RequestBody User user){
        userService.insert(user);
        return Result.success();
    }

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }
    @GetMapping("/selectAll")
    public List<User> selectAll() {
        return userService.selectAll();
    }
}