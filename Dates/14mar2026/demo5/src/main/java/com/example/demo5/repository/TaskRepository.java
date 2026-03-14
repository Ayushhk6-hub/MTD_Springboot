package com.example.demo5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo5.entity.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {

    
} 
