package com.example.mysqlDemo.Service;

import org.springframework.stereotype.Service;

import com.example.mysqlDemo.dto.request.StudentRequest;
import com.example.mysqlDemo.dto.responce.StudentResponce;
import com.example.mysqlDemo.entity.RegosterNumberEntity;
import com.example.mysqlDemo.entity.StudentEntity;
import com.example.mysqlDemo.repositary.RegesterNumber;
import com.example.mysqlDemo.repositary.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final RegesterNumber regesterNumber;
    
    
    public StudentService(StudentRepository studentRepository, RegesterNumber regesterNumber) {
        this.studentRepository = studentRepository;
        this.regesterNumber = regesterNumber;
    }

    public StudentResponce saveStudent(StudentRequest studentRequest) {
         
        StudentEntity student = new StudentEntity();
        student.setName(studentRequest.getName());
        StudentEntity savedStudent = studentRepository.save(student);

        return new StudentResponce(savedStudent.getId(), 
        savedStudent.getName(), null );
    }

    public StudentResponce assignRegistration(Long studentId, String regNumber) {
        StudentEntity student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found with id: ")); 
                
    RegosterNumberEntity register = new RegosterNumberEntity();
    register.setRegNumber(regNumber);
    RegosterNumberEntity savedRegister = regesterNumber.save(register);
    student.setRegosterNumber(savedRegister);

    studentRepository.save(student);

    return new StudentResponce(student.getId(), student.getName(), savedRegister.getRegNumber());
}
}