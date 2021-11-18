package com.example.erp.dao;

import com.example.erp.bean.Employees;

import java.util.List;

public interface EmployeesDao {
    boolean addEmployee(Employees emp);
    List<Employees> getEmployees();
    Employees getEmployeeByID (int id);
}
