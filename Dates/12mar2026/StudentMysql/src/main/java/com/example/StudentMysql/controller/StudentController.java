package com.example.StudentMysql.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentMysql.dto.request.DepartmentRequest;
import com.example.StudentMysql.dto.request.StudentRequest;
import com.example.StudentMysql.dto.responce.ApiResponce;
import com.example.StudentMysql.dto.responce.StudentResponce;
import com.example.StudentMysql.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
  
    @PostMapping("/process")
    public ApiResponce<StudentResponce> saveStudent(@RequestBody StudentRequest studentRequest) {
        StudentResponce savedStudent = studentService.saveStudent(studentRequest);
        return new ApiResponce<>("success", savedStudent);
    }
    @PostMapping("/{id}/department")
    public ApiResponce<StudentResponce> assignDepartment(
       @PathVariable Long id, 
       @RequestBody DepartmentRequest request) {
         {
        StudentResponce responce = studentService.assignDepartment(id, request.getDepname());
        return new ApiResponce<StudentResponce>("success", responce);
    }
}
}
