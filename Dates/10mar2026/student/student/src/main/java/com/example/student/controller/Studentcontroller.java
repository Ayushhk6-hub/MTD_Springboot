package com.example.student.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.dto.request.StudentRequest;
import com.example.student.dto.responce.ApiResponce;
import com.example.student.dto.responce.StudentResponce;
import com.example.student.service.StudentService;

@RestController
@RequestMapping("/students")
public class Studentcontroller {
    private final StudentService studentService;
    public Studentcontroller(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/calc")
    public ApiResponce getResult(@RequestBody StudentRequest request) {
        StudentResponce result = studentService.calculateStudentResponce(request);
        return new ApiResponce("success", result);
}
}
