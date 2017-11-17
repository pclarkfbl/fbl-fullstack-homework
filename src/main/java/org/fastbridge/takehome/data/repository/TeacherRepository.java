/**
 * TeacherRepository
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/15/17
 */
package org.fastbridge.takehome.data.repository;

import org.fastbridge.takehome.data.domain.Teacher;
import org.springframework.data.repository.CrudRepository;

/**
 * Interact with teacher table in the database
 *
 * @author vivek
 */
public interface TeacherRepository extends CrudRepository<Teacher, Integer> {
}
