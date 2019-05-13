package com.learn.sbsecuritydb.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.sbsecuritydb.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByName(String username);
}