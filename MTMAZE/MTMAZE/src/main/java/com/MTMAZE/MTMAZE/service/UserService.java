package com.MTMAZE.MTMAZE.service;

import com.MTMAZE.MTMAZE.entity.User;
import com.MTMAZE.MTMAZE.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public String deleteUser(int id) {
        userRepository.deleteById(id);
        return "User Removed!! " + id;
    }

    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getId()).orElse(null);
        if (existingUser != null) {
            existingUser.setFirstName(user.getFirstName());
            existingUser.setMiddleName(user.getMiddleName());
            existingUser.setLastName(user.getLastName());
            existingUser.setEmail(user.getEmail());
            existingUser.setPassword(user.getPassword());
            existingUser.setMobileNo(user.getMobileNo());
            existingUser.setPresentAddressId(user.getPresentAddressId());
            existingUser.setPermanentAddressId(user.getPermanentAddressId());
            existingUser.setRole(user.getRole());
            return userRepository.save(existingUser);
        }
        return null;
    }
}
