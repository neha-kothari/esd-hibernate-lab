package com.example.erp.bean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="dept")
public class Departments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dept_id;

    @Column(name="dept_name")
    private String name;

    @Column
    private String address;

    @OneToMany
    private List<Employees> employeesList;

    public Departments() {
    }

    public Departments(int dept_id, String name, String address, List<Employees> employeesList) {
        this.dept_id = dept_id;
        this.name = name;
        this.address = address;
        this.employeesList = employeesList;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employees> employeesList) {
        this.employeesList = employeesList;
    }
}
