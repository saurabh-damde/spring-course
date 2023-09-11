package com.skd.springboot.thymleafemployeecrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skd.springboot.thymleafemployeecrud.dao.EmployeeRepository;
import com.skd.springboot.thymleafemployeecrud.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository repository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = repository.findById(id);
        Employee employee = null;
        if (result.isPresent()) {
            employee = result.get();
        } else {
            throw new RuntimeException("Employee with ID: " + id + " doesn't exist!");
        }
        return employee;
    }

    @Override
    public void save(Employee employee) {
        repository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

}
