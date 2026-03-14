package com.example.billstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "bill_items")
public class BillItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bill_id")
    private BillsEntity bill;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    private Integer qty;
    private Double price;
    private Double tax;
    private Double total;
}
// User > Bills > Products
// User > Bills > BillItems > Products (Inventory)
