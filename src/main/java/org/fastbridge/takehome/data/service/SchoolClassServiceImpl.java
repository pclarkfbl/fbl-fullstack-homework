/**
 * SchoolClassServiceImpl
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/17/17
 */
package org.fastbridge.takehome.data.service;

import org.fastbridge.takehome.data.domain.School;
import org.fastbridge.takehome.data.domain.SchoolClass;
import org.fastbridge.takehome.data.repository.SchoolClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author vivek
 */
@Service
public class SchoolClassServiceImpl implements SchoolClassService {

    private final SchoolClassRepository repository;

    @Autowired
    public SchoolClassServiceImpl(SchoolClassRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(SchoolClass schoolClass) {
        repository.save(schoolClass);
    }

    @Override
    public SchoolClass getSchoolClass(Long schoolClassId) {
        return repository.findOne(schoolClassId);
    }

    @Override
    public Iterable<SchoolClass> getAllSchoolClasses() {
        return repository.findAll();
    }

    @Override
    public Iterable<SchoolClass> getSchoolClassesBySchool(Integer schoolId) {
        School school = new School();
        school.setSchoolId(schoolId);
        return repository.findAllBySchool(school);
    }
}
