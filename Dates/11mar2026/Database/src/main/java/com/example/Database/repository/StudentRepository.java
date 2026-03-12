package com.example.Database.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Database.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

    
}
