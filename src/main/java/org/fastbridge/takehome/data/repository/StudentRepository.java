/**
 * StudentRepository
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/15/17
 */
package org.fastbridge.takehome.data.repository;

import org.fastbridge.takehome.data.domain.SchoolClass;
import org.fastbridge.takehome.data.domain.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Interact with student table in the database
 *
 * @author vivek
 */
public interface StudentRepository extends CrudRepository<Student, Integer> {

    /**
     * Get students enrolled in a class
     *
     * @param schoolClass Class to get students for
     * @return Students enrolled in the class
     */
    Iterable<Student> findAllByClassEnrollments(SchoolClass schoolClass);
}
