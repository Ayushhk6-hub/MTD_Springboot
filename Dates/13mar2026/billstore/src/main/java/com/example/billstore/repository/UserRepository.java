package com.example.billstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billstore.entity.UserEntity;



public interface UserRepository extends JpaRepository<UserEntity, Long>{

} 
