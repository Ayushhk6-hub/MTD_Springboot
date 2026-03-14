package com.example.StudentMysql.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentMysql.entity.StudentEntity;

public interface StudentRepostory extends JpaRepository<StudentEntity, Long> {
    
}
