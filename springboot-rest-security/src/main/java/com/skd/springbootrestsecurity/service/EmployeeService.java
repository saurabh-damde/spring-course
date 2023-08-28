package com.skd.springbootrestsecurity.service;

import java.util.List;

import com.skd.springbootrestsecurity.entity.Employee;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
