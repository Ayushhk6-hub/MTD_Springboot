package com.example.billingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.billingsystem.dto.request.UserRequest;
import com.example.billingsystem.dto.response.ApiResponse;
import com.example.billingsystem.dto.response.UserResponse;
import com.example.billingsystem.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ApiResponse<UserResponse> createUser(@RequestBody UserRequest request) {

        UserResponse response = userService.createUser(request);

        return new ApiResponse<>("success", response);
    }

}