package com.skd.springbootrestcrud.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skd.springbootrestcrud.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> students() {
        List<Student> students = Arrays.asList(new Student("Saurabh", "Damde"),
                new Student("Sneha", "Shet"),
                new Student("Shivani", "Kamalekar"));
        return students;
    }

}
