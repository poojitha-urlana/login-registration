package com.farming.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farming.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}