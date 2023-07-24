package com.example.takeo.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.takeo.bookstore.model.User;
import com.example.takeo.bookstore.service.UserService;

@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5173/", allowedHeaders = { "Content-Type" })
    @PostMapping("/create")
    public void createUser(@RequestBody User request) {
        this.userService.create(request);
        System.out.println("User Created");
    }

    @CrossOrigin(origins = "http://127.0.0.1:5173/", allowedHeaders = { "Content-Type" })
    @GetMapping("/signup")
    public String showSignUp() {
        return "signup";
    }

}
