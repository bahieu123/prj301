/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author Nhat Anh
 */
public class Student {
   private String RollNo;
    private String Code;
    private String Name;
    private int Gender;
    private Date Birth_Day;
    private String Email;
    private String MobilePhone;

    public Student() {
    }

    public Student(String RollNo, String Code, String Name, int Gender, Date Birth_Day, String Email, String MobilePhone) {
        this.RollNo = RollNo;
        this.Code = Code;
        this.Name = Name;
        this.Gender = Gender;
        this.Birth_Day = Birth_Day;
        this.Email = Email;
        this.MobilePhone = MobilePhone;
    }

    public String getRollNo() {
        return RollNo;
    }

    public void setRollNo(String RollNo) {
        this.RollNo = RollNo;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int Gender) {
        this.Gender = Gender;
    }

    public Date getBirth_Day() {
        return Birth_Day;
    }

    public void setBirth_Day(Date Birth_Day) {
        this.Birth_Day = Birth_Day;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMobilePhone() {
        return MobilePhone;
    }

    public void setMobilePhone(String MobilePhone) {
        this.MobilePhone = MobilePhone;
    }
    
}
