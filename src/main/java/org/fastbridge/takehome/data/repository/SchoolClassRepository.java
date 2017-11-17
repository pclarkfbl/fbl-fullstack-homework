/**
 * SchoolClassRepository
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/15/17
 */
package org.fastbridge.takehome.data.repository;

import org.fastbridge.takehome.data.domain.School;
import org.fastbridge.takehome.data.domain.SchoolClass;
import org.springframework.data.repository.CrudRepository;

/**
 * Interact with school_class table in the DB.
 *
 * @author vivek
 */
public interface SchoolClassRepository extends CrudRepository<SchoolClass, Long> {

    /**
     * Get all classes in a school
     *
     * @param school School to get classes from
     * @return Classes in provided school
     */
    Iterable<SchoolClass> findAllBySchool(School school);

}
