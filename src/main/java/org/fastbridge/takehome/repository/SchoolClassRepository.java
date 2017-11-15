/**
 * SchoolClassRepository
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/15/17
 */
package org.fastbridge.takehome.repository;

import org.fastbridge.takehome.domain.SchoolClass;
import org.springframework.data.repository.CrudRepository;

/**
 * @author vivek
 */
public interface SchoolClassRepository extends CrudRepository<SchoolClass, Long> {
}
