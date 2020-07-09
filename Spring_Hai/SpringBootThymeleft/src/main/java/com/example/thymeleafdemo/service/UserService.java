package com.example.thymeleafdemo.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.thymeleafdemo.model.User;

public interface UserService {
    void save(User user);
	List<User> findAll();
	User findById(Long id);
	User findByUserName(String userName);
}
