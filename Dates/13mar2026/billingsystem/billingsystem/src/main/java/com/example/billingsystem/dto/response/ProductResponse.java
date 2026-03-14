package com.example.billingsystem.dto.response;

public class ProductResponse {

    private String prodName;
    private int prodQty;
    private double prodMrp;
    private double prodTax;
    private double prodTotal;

    public ProductResponse(String prodName, int prodQty,
                           double prodMrp, double prodTax, double prodTotal) {

        this.prodName = prodName;
        this.prodQty = prodQty;
        this.prodMrp = prodMrp;
        this.prodTax = prodTax;
        this.prodTotal = prodTotal;
    }

    public String getProdName() {
        return prodName;
    }

    public int getProdQty() {
        return prodQty;
    }

    public double getProdMrp() {
        return prodMrp;
    }

    public double getProdTax() {
        return prodTax;
    }

    public double getProdTotal() {
        return prodTotal;
    }
}