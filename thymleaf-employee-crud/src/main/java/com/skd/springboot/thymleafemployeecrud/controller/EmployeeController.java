package com.skd.springboot.thymleafemployeecrud.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skd.springboot.thymleafemployeecrud.entity.Employee;

import jakarta.annotation.PostConstruct;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private List<Employee> employees;

    @PostConstruct
    private void loadData() {

        employees = Arrays.asList(new Employee("Saurabh", "Damde", "saurabhdamde@email.com"),
                new Employee("Rohit", "Damde", "rohitdamde@email.com"),
                new Employee("John", "Doe", "johndoe@email.com"));

    }

    @GetMapping("/list")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employees);
        return "list-employees";
    }

}
