package com.example.billingsystem.dto.request;

public class ProductRequest {

    private String prodName;
    private int prodQty;
    private double prodMrp;
    private double prodTax;

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

}