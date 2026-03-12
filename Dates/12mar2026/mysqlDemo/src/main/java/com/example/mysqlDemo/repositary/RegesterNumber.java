package com.example.mysqlDemo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysqlDemo.entity.RegosterNumberEntity;

public interface RegesterNumber extends JpaRepository<RegosterNumberEntity, Long> {
    
}
