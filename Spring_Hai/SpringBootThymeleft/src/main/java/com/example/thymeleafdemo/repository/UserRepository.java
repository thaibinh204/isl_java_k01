package com.example.thymeleafdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.thymeleafdemo.model.*;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
