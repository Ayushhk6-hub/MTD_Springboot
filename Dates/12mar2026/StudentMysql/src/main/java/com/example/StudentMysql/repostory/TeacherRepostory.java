package com.example.StudentMysql.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentMysql.entity.TeacherEnitiy;

public interface TeacherRepostory extends JpaRepository<TeacherEnitiy,Long> {
    
}
