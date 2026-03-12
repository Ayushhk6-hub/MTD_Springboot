package com.example.mysqlDemo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mysqlDemo.Service.StudentService;
import com.example.mysqlDemo.dto.request.RegisterRequest;
import com.example.mysqlDemo.dto.request.StudentRequest;
import com.example.mysqlDemo.dto.responce.ApiResponce;
import com.example.mysqlDemo.dto.responce.StudentResponce;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    @PostMapping("/process")
    public ApiResponce<StudentResponce> saveStudent(@RequestBody StudentRequest studentRequest) {
        StudentResponce studentResponce = studentService.saveStudent(studentRequest);
        return new ApiResponce<>("success", studentResponce);
}
 @PostMapping("/{id}/register")
    public ApiResponce<StudentResponce> assignRegister(
        @PathVariable Long id,
        @RequestBody RegisterRequest request
    ) {
        StudentResponce responce = studentService.assignRegistration(id, request.getRegisterationNumber());
        return new ApiResponce<StudentResponce>("success", responce);
    }
}
