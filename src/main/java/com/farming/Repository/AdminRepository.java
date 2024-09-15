package com.farming.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farming.Model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);
}