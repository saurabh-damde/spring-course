package com.skd.springbootrestsecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skd.springbootrestsecurity.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
