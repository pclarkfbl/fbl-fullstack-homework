/**
 * SchoolRepository
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/15/17
 */
package org.fastbridge.takehome.repository;

import org.fastbridge.takehome.domain.School;
import org.springframework.data.repository.CrudRepository;

/**
 * Interact with school table in database.
 *
 * @author vivek
 */
public interface SchoolRepository extends CrudRepository<School, Integer> {

    /**
     * Get schools in a district
     *
     * @param districtId District to fetch schools for
     * @return Schools in district
     */
    Iterable<School> findSchoolsByDistrictId(Integer districtId);
}
