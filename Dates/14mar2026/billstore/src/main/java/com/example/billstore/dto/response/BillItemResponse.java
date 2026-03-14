package com.example.billstore.dto.response;

import lombok.Data;

@Data
public class BillItemResponse {
    private Long id;
    private Long billId;
    private Long productId;
    private Integer qty;
    private Double price;
    private Double tax;
    private Double total;
}
