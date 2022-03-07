package com.example.pdsexercici;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
class UserController {
    private UserRepository repository;

    UserController(UserRepository repository) {
        this.repository = repository;
    }

    @Autowired
    UserService userService;

    @RequestMapping(path="/users")

    @GetMapping("")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
