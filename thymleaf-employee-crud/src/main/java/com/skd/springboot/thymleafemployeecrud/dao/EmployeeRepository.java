package com.skd.springboot.thymleafemployeecrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skd.springboot.thymleafemployeecrud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
