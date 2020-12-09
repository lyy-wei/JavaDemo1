package com.soft.bean;

import java.util.Map;

public class UserInfo {
    private int id;
    private String userName;
    private String password;
    private String sex;
    private String education;
    private String work;
    private String phone;
    private String email;
    private int classId;
    private Classes classesInfo;

    public UserInfo() {
    }

    public UserInfo(int id, String userName, String password, String sex, String education, String work, String phone, String email, int classId) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.education = education;
        this.work = work;
        this.phone = phone;
        this.email = email;
        this.classId = classId;
    }

    public Classes getClassesInfo() {
        return classesInfo;
    }

    public void setClassesInfo(Classes classesInfo) {
        this.classesInfo = classesInfo;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}