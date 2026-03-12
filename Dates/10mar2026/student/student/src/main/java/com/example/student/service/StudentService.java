package com.example.student.service;

import org.springframework.stereotype.Service;

import com.example.student.dto.request.StudentRequest;
import com.example.student.dto.responce.StudentResponce;

@Service
public class StudentService {
    public StudentResponce calculateStudentResponce(StudentRequest req) {
        int total = 0;
        total = req.getMarks1() + req.getMarks2() + req.getMarks3() + req.getMarks4()  + req.getMarks5();

        double percentage = total / 5.0;
        String result = percentage >= 75 ? "Pass" : "Fail";

        return new StudentResponce(
            req.getName(), req.getRollNumber(), total, percentage, result);
        


    }
    
}

