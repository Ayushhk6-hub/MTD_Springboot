package com.example.Database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;  

@Entity
public class Student {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;    
    private String name;
    private int rollnumber;
    private double percentage;  
    private String result;
    private int total;
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollnumber() {
        return rollnumber;
    }
    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }
    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }





}
