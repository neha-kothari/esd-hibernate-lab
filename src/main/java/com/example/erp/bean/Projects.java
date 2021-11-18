package com.example.erp.bean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Projects {
    @Id @GeneratedValue
    private int id;

    @Column
    private String name;

    @ManyToMany
    private List<Employees> employeesList;

    public Projects() {
    }

    public Projects(int id, String name, List<Employees> employeesList) {
        this.id = id;
        this.name = name;
        this.employeesList = employeesList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employees> employeesList) {
        this.employeesList = employeesList;
    }
}
