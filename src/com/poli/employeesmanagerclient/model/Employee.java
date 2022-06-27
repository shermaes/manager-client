/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poli.employeesmanagerclient.model;

/**
 *
 * @author dannymvp
 */
public class Employee {
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String birthdate;
    private Float salary;
    private Float fee;
    private String positionId;
    private String departmentId;
    private String managerId;

    public Employee(String id, String firstname, String lastname, String email, String birthdate, Float salary, Float fee, String positionId, String departmentId, String managerId) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.birthdate = birthdate;
        this.salary = salary;
        this.fee = fee;
        this.positionId = positionId;
        this.departmentId = departmentId;
        this.managerId = managerId;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Float getFee() {
        return fee;
    }

    public void setFee(Float fee) {
        this.fee = fee;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%.5f,%.5f,%s,%s,%s", this.getId(), 
                this.getFirstname(), this.getLastname(), this.getEmail(), this.getBirthdate(), 
                this.getSalary(), this.getFee(), this.getPositionId(), this.getDepartmentId(), 
                this.getManagerId());
    }
    
}
