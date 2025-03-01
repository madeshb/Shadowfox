package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestParam String username, @RequestParam String password, @RequestParam String email) {
        return userService.registerUser(username, password, email);
    }

    @GetMapping("/login")
    public User loginUser(@RequestParam String username) {
        return userService.findUserByUsername(username);
    }
}