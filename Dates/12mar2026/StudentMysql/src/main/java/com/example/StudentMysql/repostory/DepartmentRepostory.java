package com.example.StudentMysql.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentMysql.entity.DepartmentEntity;

public interface DepartmentRepostory extends JpaRepository<DepartmentEntity,Long> {
    
}
