/**
 * SchoolServiceImpl
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/17/17
 */
package org.fastbridge.takehome.data.service;

import org.fastbridge.takehome.data.domain.School;
import org.fastbridge.takehome.data.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author vivek
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;

    @Autowired
    public SchoolServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public void save(School school) {
        schoolRepository.save(school);
    }

    @Override
    public Iterable<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    @Override
    public Iterable<School> getSchoolsInDistrict(Integer districtId) {
        return schoolRepository.findSchoolsByDistrictId(districtId);
    }
}
