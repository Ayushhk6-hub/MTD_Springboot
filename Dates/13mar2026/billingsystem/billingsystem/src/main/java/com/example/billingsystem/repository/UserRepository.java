package com.example.billingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.billingsystem.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}