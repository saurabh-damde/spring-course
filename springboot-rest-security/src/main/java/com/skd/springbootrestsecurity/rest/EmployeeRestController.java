package com.skd.springbootrestsecurity.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skd.springbootrestsecurity.entity.Employee;
import com.skd.springbootrestsecurity.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService service;

    @Autowired
    public EmployeeRestController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return service.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee employee = service.findById(employeeId);
        if (employee == null) {
            throw new RuntimeException("Employee with ID: " + employeeId + " not found!");
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee postMethodName(@RequestBody Employee employee) {
        employee.setId(0);
        Employee dbEmployee = service.save(employee);
        return dbEmployee;
    }

    @PutMapping("/employees")
    public Employee updatEmployee(@RequestBody Employee employee) {
        Employee dbEmployee = service.save(employee);
        return dbEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        Employee employee = service.findById(employeeId);
        if (employee == null) {
            throw new RuntimeException("Employee with ID: " + employeeId + " not found!");
        }
        service.deleteById(employeeId);
        return "Deleted Employee with ID: " + employeeId;
    }

}
