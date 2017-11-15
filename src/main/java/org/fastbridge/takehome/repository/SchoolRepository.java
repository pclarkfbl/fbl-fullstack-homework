/**
 * SchoolRepository
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/15/17
 */
package org.fastbridge.takehome.repository;

import java.util.List;

import org.fastbridge.takehome.domain.School;
import org.springframework.data.repository.CrudRepository;

/**
 * @author vivek
 */
public interface SchoolRepository extends CrudRepository<School, Integer> {

    List<School> findSchoolsByDistrictId(Integer districtId);
}
