package com.example.billingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.billingsystem.entity.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}