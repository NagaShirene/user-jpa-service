/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Fadhil.userjpaservice.repository;

import com.Fadhil.userjpaservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author VOLTURI
 */
public interface UserRepository extends JpaRepository<User, Long>{

    public User findByUserId(Long userId);
    
}