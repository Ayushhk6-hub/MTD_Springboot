package com.example.billstore.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.billstore.service.UserService;
import com.example.billstore.dto.response.ApiResponse;
import com.example.billstore.dto.response.UserResponse;
import com.example.billstore.dto.request.UserRequest;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @PostMapping
    public ApiResponse<UserResponse> createUser(@RequestBody UserRequest request){
        UserResponse response = userService.createUser(request);
        return new ApiResponse<UserResponse>("success", response);
    }
}
