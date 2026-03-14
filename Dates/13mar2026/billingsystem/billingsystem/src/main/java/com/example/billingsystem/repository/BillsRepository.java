package com.example.billingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.billingsystem.entity.Bills;

public interface BillsRepository extends JpaRepository<Bills, Long> {
}