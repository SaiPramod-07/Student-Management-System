/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sms.model;

/**
 *
 * @author saipr
 */
public class Student {
    private int id;
    private String stdName;
    private String stdFatherName;
    private String stdBlood;
    private String stdPhone;
    private String stdCity;
    private String studentClass;

    public Student(String stdName, String stdFatherName, String stdBlood,
                   String stdPhone, String stdCity, String studentClass) {

        this.stdName = stdName;
        this.stdFatherName = stdFatherName;
        this.stdBlood = stdBlood;
        this.stdPhone = stdPhone;
        this.stdCity = stdCity;
        this.studentClass = studentClass;
    }

    public String getStdName() {
        return stdName;
    }

    public String getStdFatherName() {
        return stdFatherName;
    }

    public String getStdBlood() {
        return stdBlood;
    }

    public String getStdPhone() {
        return stdPhone;
    }

    public String getStdCity() {
        return stdCity;
    }

    public String getStudentClass() {
        return studentClass;
    }
}
