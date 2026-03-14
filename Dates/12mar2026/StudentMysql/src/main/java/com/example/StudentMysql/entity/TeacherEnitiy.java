package com.example.StudentMysql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "teachers")
public class TeacherEnitiy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "teachername")
    private String teachname;
    @Column(name = "teachernumber")
    private int teachnumber;

    @OneToOne
    @JoinColumn(name = "department_id")
    private DepartmentEntity department;    

    
    public DepartmentEntity getDepartment() {
        return department;
    }
    public void setDepartment(DepartmentEntity department) {
        this.department = department;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTeachname() {
        return teachname;
    }
    public void setTeachname(String teachname) {
        this.teachname = teachname;
    }
    public int getTeachnumber() {
        return teachnumber;
    }
    public void setTeachnumber(int teachnumber) {
        this.teachnumber = teachnumber;
    }
}
