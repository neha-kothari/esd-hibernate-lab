package com.example.erp.bean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int project_id;

    @Column
    private String project_name;

    @ManyToMany
    private List<Employees> employeesList;

    public Projects() {
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employees> employeesList) {
        this.employeesList = employeesList;
    }
}
