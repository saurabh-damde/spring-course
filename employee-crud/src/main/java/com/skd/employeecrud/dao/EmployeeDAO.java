package com.skd.employeecrud.dao;

import java.util.List;

import com.skd.employeecrud.entity.Employee;

public interface EmployeeDAO {
    List<Employee> findAll();
}
