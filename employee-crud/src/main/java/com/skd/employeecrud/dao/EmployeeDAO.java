package com.skd.employeecrud.dao;

import java.util.List;

import com.skd.employeecrud.entity.Employee;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);

}
