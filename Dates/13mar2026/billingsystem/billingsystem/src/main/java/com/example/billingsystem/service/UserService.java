package com.example.billingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.billingsystem.dto.request.UserRequest;
import com.example.billingsystem.dto.response.UserResponse;
import com.example.billingsystem.entity.User;
import com.example.billingsystem.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserResponse createUser(UserRequest request) {

        User user = new User();
        user.setName(request.getName());

        User savedUser = userRepository.save(user);

        return new UserResponse(savedUser.getId(), savedUser.getName());
    }

}