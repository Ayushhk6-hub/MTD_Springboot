package com.example.product.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.dto.request.ProductRequest;
import com.example.product.dto.responce.ApiResponce;
import com.example.product.dto.responce.ProductResponce;
import com.example.product.service.ProductService;

@RestController
@RequestMapping("/products")
public class Productcontroller {
    public final ProductService productService;
    public Productcontroller(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/calc")
    public ApiResponce getResult(@RequestBody ProductRequest request){
        ProductResponce result = productService.calProductResponce(request);
        return new ApiResponce("success", result);
    }
}
