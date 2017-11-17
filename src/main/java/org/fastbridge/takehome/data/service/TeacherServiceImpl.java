/**
 * TeacherServiceImpl
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/17/17
 */
package org.fastbridge.takehome.data.service;

import org.fastbridge.takehome.data.domain.Teacher;
import org.fastbridge.takehome.data.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author vivek
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository repository;

    @Autowired
    public TeacherServiceImpl(TeacherRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Teacher teacher) {
        repository.save(teacher);
    }

    @Override
    public Iterable<Teacher> getAllTeachers() {
        return repository.findAll();
    }
}
