package com.skd.crudtest.dao;

import com.skd.crudtest.entity.Student;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);
}
