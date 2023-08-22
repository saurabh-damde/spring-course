package com.skd.employeecrud.service;

import java.util.List;

import com.skd.employeecrud.entity.Employee;

public interface EmployeeService {
    List<Employee> findAll();
}
