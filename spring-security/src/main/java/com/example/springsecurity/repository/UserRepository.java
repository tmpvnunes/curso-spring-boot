package com.example.springsecurity.repository;

import com.example.springsecurity.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {
    User findByUsername(String username);
}
