package com.example.product.dto.responce;

public class ProductResponce {
    private String name;
    private double total;
    private double tax;
    private double netTotal;
    public ProductResponce(String name, double total, double tax, double netTotal) {
        this.name = name;
        this.total = total;
        this.tax = tax;
        this.netTotal = netTotal;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
    public double getNetTotal() {
        return netTotal;
    }
    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }
}

