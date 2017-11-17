/**
 * StudentServiceImpl
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/17/17
 */
package org.fastbridge.takehome.data.service;

import org.fastbridge.takehome.data.domain.SchoolClass;
import org.fastbridge.takehome.data.domain.Student;
import org.fastbridge.takehome.data.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author vivek
 */
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    @Autowired
    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Student student) {
        repository.save(student);
    }

    @Override
    public Iterable<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Iterable<Student> getStudentsInClass(Long schoolClassId) {
        SchoolClass schoolClass = new SchoolClass();
        schoolClass.setSchoolClassId(schoolClassId);
        return repository.findAllByClassEnrollments(schoolClass);
    }
}
