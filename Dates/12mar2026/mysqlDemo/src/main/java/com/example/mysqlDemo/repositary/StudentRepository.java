package com.example.mysqlDemo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysqlDemo.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
    
}
