package com.example.StudentMysql.service;

import org.springframework.stereotype.Service;

import com.example.StudentMysql.entity.DepartmentEntity;
import com.example.StudentMysql.repostory.DepartmentRepostory;

@Service
public class DepartmentService {
    private final DepartmentRepostory departmentRepostory;

    public DepartmentService(DepartmentRepostory departmentRepostory) {
        this.departmentRepostory = departmentRepostory;
    }
    public DepartmentEntity saveDepartment(String depname) {
        DepartmentEntity department = new DepartmentEntity();
        department.setDepname(depname);
        return departmentRepostory.save(department);
    }
}
