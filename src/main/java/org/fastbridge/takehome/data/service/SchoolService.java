/**
 * SchoolInterface
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/17/17
 */
package org.fastbridge.takehome.data.service;

import org.fastbridge.takehome.data.domain.School;

/**
 * @author vivek
 */
public interface SchoolService {

    void save(School school);

    Iterable<School> getAllSchools();

    Iterable<School> getSchoolsInDistrict(Integer districtId);
}
