package com.MTMAZE.MTMAZE.controller;
import com.MTMAZE.MTMAZE.entity.User;
import com.MTMAZE.MTMAZE.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/RequestUser")
public class UserController {
        @Autowired
        private UserService userService;

        @PostMapping("/addUser")
        public User addUser(@RequestBody User user) {
            return userService.saveUser(user);
        }

        @GetMapping("/User")
        public List<User> getAllUser() {
            return userService.getAllUsers();
        }

        @GetMapping("/User/{id}")
        public User findUserById(@PathVariable int id) {
            return userService.getUserById(id);
        }
        @PutMapping("/updateUser")
        public User updateUser(@RequestBody User user) {
            return userService.updateUser(user);
        }
    }
