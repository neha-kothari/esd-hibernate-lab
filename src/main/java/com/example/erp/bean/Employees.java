package com.example.erp.bean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Employees {
    @Id
    private int emp_id;

    @Column
    private String name;

    @Column
    private String dob;

    @ManyToOne
    @JoinColumn(name="dept_id")
    private Departments departments;

    @ManyToMany
    private List<Projects> projectsList;

    public Employees() {
    }

    public Employees(int emp_id, String name, String dob, Departments departments, List<Projects> projectsList) {
        this.emp_id = emp_id;
        this.name = name;
        this.dob = dob;
        this.departments = departments;
        this.projectsList = projectsList;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

    public List<Projects> getProjectsList() {
        return projectsList;
    }

    public void setProjectsList(List<Projects> projectsList) {
        this.projectsList = projectsList;
    }
}
