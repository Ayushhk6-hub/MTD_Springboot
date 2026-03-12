package com.example.product.dto.responce;

public class ApiResponce {
    private String status;
    private ProductResponce data;
    public ApiResponce(String status, ProductResponce data) {
        this.status = status;
        this.data = data;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public ProductResponce getData() {
        return data;
    }
    public void setData(ProductResponce data) {
        this.data = data;
    }

    
}
