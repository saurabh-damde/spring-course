package com.skd.employeecrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skd.employeecrud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
