package com.skd.springboot.thymleafemployeecrud.service;

import java.util.List;

import com.skd.springboot.thymleafemployeecrud.entity.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    void save(Employee employee);

    void deleteById(int id);

}
