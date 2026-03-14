package com.example.StudentMysql.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentMysql.dto.request.DepartmentRequest;
import com.example.StudentMysql.dto.request.TeacherRequest;
import com.example.StudentMysql.dto.responce.ApiResponce;
import com.example.StudentMysql.dto.responce.TeacherResponce;
import com.example.StudentMysql.service.TeacherService;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
    
    @PostMapping("/process")
    public ApiResponce<TeacherResponce> saveTeacher(@RequestBody TeacherRequest teacherRequest) {
        TeacherResponce savedTeacher = teacherService.saveTeacher(teacherRequest);
        return new ApiResponce<>("success", savedTeacher);
    }   
    
    @PostMapping("/{id}/department")
    public ApiResponce<TeacherResponce> assignDepartmentToTeacher(
        @PathVariable Long id, 
        @RequestBody DepartmentRequest request) {
          {
         TeacherResponce responce = teacherService.assignDepartmentToTeacher(id, request.getDepname());
         return new ApiResponce<TeacherResponce>("success", responce);
    }
}
}
