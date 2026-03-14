package com.example.billingsystem.dto.response;

import java.util.List;

public class BillResponse {

    private Long billId;
    private Long userId;
    private List<ProductResponse> products;

    public BillResponse(Long billId, Long userId, List<ProductResponse> products) {
        this.billId = billId;
        this.userId = userId;
        this.products = products;
    }

    public Long getBillId() {
        return billId;
    }

    public Long getUserId() {
        return userId;
    }

    public List<ProductResponse> getProducts() {
        return products;
    }
}