/**
 * SchoolClassService
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/17/17
 */
package org.fastbridge.takehome.data.service;

import org.fastbridge.takehome.data.domain.SchoolClass;

/**
 * @author vivek
 */
public interface SchoolClassService {

    void save(SchoolClass schoolClass);

    SchoolClass getSchoolClass(Long schoolClassId);

    Iterable<SchoolClass> getAllSchoolClasses();

    Iterable<SchoolClass> getSchoolClassesBySchool(Integer schoolId);
}
