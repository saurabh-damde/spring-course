package com.skd.crudtest.dao;

import java.util.List;

import com.skd.crudtest.entity.Student;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    void update(Student student);
}
