package com.skd.crudtest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.skd.crudtest.entity.Student;

import jakarta.persistence.EntityManager;

@Repository
public class StudentDAOImpl implements StudentDAO {

    private EntityManager manager;

    @Autowired
    public StudentDAOImpl(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        manager.persist(student);
    }

    @Override
    public Student findById(Integer id) {
        return manager.find(Student.class, id);
    }

}
