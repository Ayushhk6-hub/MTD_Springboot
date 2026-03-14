package com.example.billingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.billingsystem.dto.request.BillRequest;
import com.example.billingsystem.dto.response.ApiResponse;
import com.example.billingsystem.dto.response.BillResponse;
import com.example.billingsystem.service.BillService;

@RestController
@RequestMapping("/bills")
public class BillController {

    @Autowired
    private BillService billService;

    @PostMapping
    public ApiResponse<BillResponse> createBill(@RequestBody BillRequest request) {

        BillResponse response = billService.createBill(request);

        return new ApiResponse<>("success", response);
    }

}