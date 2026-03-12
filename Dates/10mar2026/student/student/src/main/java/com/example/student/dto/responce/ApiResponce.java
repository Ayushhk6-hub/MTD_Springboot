package com.example.student.dto.responce;

public class ApiResponce {
    private String status;
    private StudentResponce data;

    public ApiResponce(String status, StudentResponce data) {
        this.status = status;
        this.data = data;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public StudentResponce getData() {
        return data;
    }
    public void setData(StudentResponce data) {
        this.data = data;
    }

    
}
