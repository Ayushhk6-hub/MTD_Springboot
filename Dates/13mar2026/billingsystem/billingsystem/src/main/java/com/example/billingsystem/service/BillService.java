package com.example.billingsystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.billingsystem.dto.request.BillRequest;
import com.example.billingsystem.dto.request.ProductRequest;
import com.example.billingsystem.dto.response.BillResponse;
import com.example.billingsystem.dto.response.ProductResponse;
import com.example.billingsystem.entity.Bills;
import com.example.billingsystem.entity.Products;
import com.example.billingsystem.entity.User;
import com.example.billingsystem.repository.BillsRepository;
import com.example.billingsystem.repository.UserRepository;

@Service
public class BillService {

    @Autowired
    private BillsRepository billsRepository;

    @Autowired
    private UserRepository userRepository;

    public BillResponse createBill(BillRequest request) {

        User user = userRepository.findById(request.getUserId()).orElseThrow();

        Bills bill = new Bills();
        bill.setUser(user);

        List<Products> productsList = new ArrayList<>();
        List<ProductResponse> responseList = new ArrayList<>();

        for (ProductRequest p : request.getProducts()) {

            Products product = new Products();

            product.setProdName(p.getProdName());
            product.setProdQty(p.getProdQty());
            product.setProdMrp(p.getProdMrp());
            product.setProdTax(p.getProdTax());

            double total = p.getProdQty() * p.getProdMrp();
            product.setProdTotal(total);

            product.setBill(bill);

            productsList.add(product);

            responseList.add(new ProductResponse(
                    p.getProdName(),
                    p.getProdQty(),
                    p.getProdMrp(),
                    p.getProdTax(),
                    total
            ));
        }

        bill.setProducts(productsList);

        Bills savedBill = billsRepository.save(bill);

        return new BillResponse(savedBill.getId(), user.getId(), responseList);
    }

}