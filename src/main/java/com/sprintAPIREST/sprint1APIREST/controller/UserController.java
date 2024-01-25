package com.sprintAPIREST.sprint1APIREST.controller;

import com.sprintAPIREST.sprint1APIREST.model.User;
import com.sprintAPIREST.sprint1APIREST.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/v1/user")

public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public HashMap<String, User> findAllUser() {
        return userService.findAllUser();
    }

    @GetMapping("/{document}")
    public User findUserByDocument(@PathVariable("document")String document) {
        return userService.findUserByDocument(document);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/{document}")
    public User updateUser(@PathVariable String document,@RequestBody User user) {
        return userService.updateUser(document,user);
    }

    @DeleteMapping
    public User deleteUser(@PathVariable String document) {
        return userService.deleteUser(document);
    }

}
