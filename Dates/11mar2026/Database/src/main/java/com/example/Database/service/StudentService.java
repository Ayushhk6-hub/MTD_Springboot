package com.example.Database.service;
import com.example.Database.repository.StudentRepository;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Database.dto.request.StudentRequest;
import com.example.Database.dto.response.StudentResponse;
import com.example.Database.entity.Student; 
@Service  
public class StudentService {
    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }  
    public StudentResponse processstudent(StudentRequest request)
    {
        int total=request.getMarks().stream().mapToInt(Integer::intValue).sum();
        int subject=request.getMarks().size();
        double percentage=(double)total/subject;   
        String result=percentage>=75?"pass":"fail";

        Student student=new Student();

        student.setName(request.getName());
        student.setRollnumber(request.getRollnumber());
        student.setPercentage(percentage);
        student.setResult(result);

        studentRepository.save(student);

        return new StudentResponse(request.getName(),
        request.getRollnumber(),
        total,
        percentage,
        result);
    } 
    public List<StudentResponse> getAllStudentResults()
        {
            return studentRepository.findAll().stream()
            .map(student -> new StudentResponse(
                student.getName(),
                student.getRollnumber(),
                student.getTotal(),
                student.getPercentage(),
                student.getResult()
            )).toList();
        }


}
