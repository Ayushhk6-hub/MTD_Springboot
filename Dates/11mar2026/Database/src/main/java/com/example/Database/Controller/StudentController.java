package com.example.Database.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Database.dto.request.StudentRequest;
import com.example.Database.dto.response.ApiResponse;
import com.example.Database.dto.response.StudentResponse;
import com.example.Database.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/process")
    public ApiResponse<StudentResponse> processStudent(@RequestBody StudentRequest request) {

        StudentResponse response = studentService.processstudent(request);

        return new ApiResponse<StudentResponse>("success", response);
    }
     
    @GetMapping("/results")
    public ApiResponse<List<StudentResponse>> getAllStudentResults() {
        List<StudentResponse> results = studentService.getAllStudentResults();
        return new ApiResponse<List<StudentResponse>>("success", results);
    }


}