package com.example.StudentMysql.service;

import org.springframework.stereotype.Service;

import com.example.StudentMysql.dto.request.TeacherRequest;
import com.example.StudentMysql.dto.responce.TeacherResponce;
import com.example.StudentMysql.entity.DepartmentEntity;
import com.example.StudentMysql.entity.TeacherEnitiy;
import com.example.StudentMysql.repostory.DepartmentRepostory;
import com.example.StudentMysql.repostory.TeacherRepostory;

@Service
public class TeacherService {
    private final TeacherRepostory teacherRepostory;
    private final DepartmentRepostory departmentRepostory;
    public TeacherService(TeacherRepostory teacherRepostory, DepartmentRepostory departmentRepostory) {
        this.teacherRepostory = teacherRepostory;
        this.departmentRepostory = departmentRepostory;
    }
   public TeacherResponce saveTeacher(TeacherRequest teacherRequest) {
       TeacherEnitiy teacher = new TeacherEnitiy();
       teacher.setTeachname(teacherRequest.getTeachname());
       teacher.setTeachnumber(teacherRequest.getTeachnumber());
         TeacherEnitiy savedTeacher = teacherRepostory.save(teacher);
         return new TeacherResponce(savedTeacher.getId(), savedTeacher.getTeachname(), 
         savedTeacher.getTeachnumber(),null);
    }
    public TeacherResponce assignDepartmentToTeacher(Long teacherId, String depname) {
        TeacherEnitiy teacher = teacherRepostory.findById(teacherId)
                .orElseThrow(() -> new RuntimeException("Teacher not found with id: "));
        DepartmentEntity department = departmentRepostory.findById(teacherId)
                .orElseThrow(() -> new RuntimeException("Department not found with id: "));
    
    DepartmentEntity departmentEntity = new DepartmentEntity();
    departmentEntity.setDepname(depname);
    DepartmentEntity savedDepartment = departmentRepostory.save(departmentEntity);

    teacherRepostory.save(teacher);
    departmentRepostory.save(department);
    return new TeacherResponce(teacher.getId(), teacher.getTeachname(), teacher.getTeachnumber(), savedDepartment.getDepname());
}
}

