/**
 * StudentService
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/17/17
 */
package org.fastbridge.takehome.data.service;

import org.fastbridge.takehome.data.domain.Student;

/**
 * @author vivek
 */
public interface StudentService {

    void save(Student student);

    Iterable<Student> getAllStudents();

    Iterable<Student> getStudentsInClass(Long schoolClassId);
}
