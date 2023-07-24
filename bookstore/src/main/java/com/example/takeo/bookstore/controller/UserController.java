package com.example.takeo.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.takeo.bookstore.model.User;
import com.example.takeo.bookstore.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public void createUser(@RequestBody User request) {
        this.userService.create(request);
        System.out.println("User Created");
    }

    @GetMapping("/signup")
    public String showSignUp() {
        return "signup";
    }

}
