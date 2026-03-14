package com.example.StudentMysql.service;

import org.springframework.stereotype.Service;

import com.example.StudentMysql.dto.request.StudentRequest;
import com.example.StudentMysql.dto.responce.StudentResponce;
import com.example.StudentMysql.entity.DepartmentEntity;
import com.example.StudentMysql.entity.StudentEntity;
import com.example.StudentMysql.repostory.DepartmentRepostory;
import com.example.StudentMysql.repostory.StudentRepostory;

@Service
public class StudentService {
    private final StudentRepostory studentRepostory;
    private final DepartmentRepostory departmentRepostory;

    public StudentService(StudentRepostory studentRepostory, DepartmentRepostory departmentRepostory) {
        this.studentRepostory = studentRepostory;
        this.departmentRepostory = departmentRepostory;
    }

    public StudentResponce saveStudent(StudentRequest studentRequest) {
        StudentEntity student = new StudentEntity();
        student.setName(studentRequest.getName());
        student.setAddress(studentRequest.getAddress());
        student.setPhonenumber(studentRequest.getPhonenumber());
        StudentEntity savedStudent = studentRepostory.save(student);

        return new StudentResponce(savedStudent.getId(), savedStudent.getName(), savedStudent.getAddress(), savedStudent.getPhonenumber(), null);
}
    public StudentResponce assignDepartment(Long studentId, String depname) {
     
        StudentEntity student = studentRepostory.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found with id: "));
        DepartmentEntity department = departmentRepostory.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Department not found with id: "));

        DepartmentEntity departmentEntity = new DepartmentEntity();
        departmentEntity.setDepname(depname);
        DepartmentEntity savedDepartment = departmentRepostory.save(departmentEntity);
        student.setDepartment(savedDepartment);

        studentRepostory.save(student);
        departmentRepostory.save(department);

        return new StudentResponce(student.getId(), student.getName(), student.getAddress(), student.getPhonenumber(), savedDepartment.getDepname());
}
}