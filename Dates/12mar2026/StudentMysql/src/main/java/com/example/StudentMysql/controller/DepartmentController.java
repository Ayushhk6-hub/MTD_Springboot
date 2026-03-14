package com.example.StudentMysql.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentMysql.entity.DepartmentEntity;
import com.example.StudentMysql.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service){
        this.service=service;
    }

    @PostMapping("/add")
    public DepartmentEntity saveDepartment(@RequestParam String name){
        return service.saveDepartment(name);
    }
}
