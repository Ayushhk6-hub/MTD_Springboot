package com.example.product.service;

import org.springframework.stereotype.Service;

import com.example.product.dto.request.ProductRequest;
import com.example.product.dto.responce.ProductResponce;

@Service
public class ProductService {
    public ProductResponce calProductResponce(ProductRequest req){
        double total = req.getProduct1() + req.getProduct2() + req.getProduct3() + req.getProduct4() + req.getProduct5() + req.getProduct6() + req.getProduct7() + req.getProduct8() + req.getProduct9() + req.getProduct10();
        double tax = total * 0.18; // Assuming a tax rate of 18%
        double netTotal = total + tax;
        return new ProductResponce(req.getName(), total, tax, netTotal);
    }
}
