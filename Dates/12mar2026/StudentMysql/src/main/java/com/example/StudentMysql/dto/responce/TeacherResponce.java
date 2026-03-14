package com.example.StudentMysql.dto.responce;

public class TeacherResponce {
    private Long id;
    private String teachname;
    private int teachnumber;
    private String depname;
    public TeacherResponce(Long id, String teachname, int teachnumber, String depname) {
        this.id = id;
        this.teachname = teachname;
        this.teachnumber = teachnumber;
        this.depname = depname;
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
    public String getDepname() {
        return depname;
    }
    public void setDepname(String depname) {
        this.depname = depname;
    }


}
