package com.example.billingsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bill_id")
    private Bills bill;

    private String prodName;
    private int prodQty;
    private double prodMrp;
    private double prodTax;
    private double prodTotal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Bills getBill() {
        return bill;
    }

    public void setBill(Bills bill) {
        this.bill = bill;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdQty() {
        return prodQty;
    }

    public void setProdQty(int prodQty) {
        this.prodQty = prodQty;
    }

    public double getProdMrp() {
        return prodMrp;
    }

    public void setProdMrp(double prodMrp) {
        this.prodMrp = prodMrp;
    }

    public double getProdTax() {
        return prodTax;
    }

    public void setProdTax(double prodTax) {
        this.prodTax = prodTax;
    }

    public double getProdTotal() {
        return prodTotal;
    }

    public void setProdTotal(double prodTotal) {
        this.prodTotal = prodTotal;
    }
}