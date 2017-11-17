/**
 * TeacherInterface
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/17/17
 */
package org.fastbridge.takehome.data.service;

import org.fastbridge.takehome.data.domain.Teacher;

/**
 * @author vivek
 */
public interface TeacherService {

    void save(Teacher teacher);

    Iterable<Teacher> getAllTeachers();
}
