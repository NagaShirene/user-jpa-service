/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Fadhil.userjpaservice.service;

import com.Fadhil.userjpaservice.entity.User;
import com.Fadhil.userjpaservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author VOLTURI
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
     public User saveUser(User user){
        return userRepository.save(user);
    }
    
    public User findUserById(Long userId){
        return userRepository.findByUserId(userId);
    }

}

