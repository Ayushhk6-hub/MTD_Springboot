package com.example.billstore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.billstore.service.ProductService;
import com.example.billstore.dto.response.ApiResponse;
import com.example.billstore.dto.response.ProductResponse;
import com.example.billstore.dto.request.ProductRequest;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    @PostMapping
    public ApiResponse<ProductResponse> createProduct(@RequestBody ProductRequest request){
        ProductResponse response = productService.createProduct(request);
        return new ApiResponse<ProductResponse>("success", response);
    }

    @GetMapping("/bill/{billId}")
    public ApiResponse<List<ProductResponse>> getProductsByBill(@PathVariable Long billId){
        List<ProductResponse> responses = productService.getProductsByBill(billId);
        return new ApiResponse<List<ProductResponse>>("success", responses);
    }

}
