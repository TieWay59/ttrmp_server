package com.tieway59.ttrmp.controller;

import com.tieway59.ttrmp.domain.User;
import com.tieway59.ttrmp.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/{id}")
    public User getUser(@PathVariable("id") int id) {
        return userService.query().eq("user_id", id).one();
    }
}
