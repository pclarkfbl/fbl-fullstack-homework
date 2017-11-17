/**
 * StudentRESTController
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/16/17
 */
package org.fastbridge.takehome.controller;

import java.util.Collections;

import org.fastbridge.takehome.domain.Student;
import org.fastbridge.takehome.repository.SchoolClassRepository;
import org.fastbridge.takehome.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vivek
 */
@RestController
public class StudentRESTController {

    private final StudentRepository studentRepository;

    private final SchoolClassRepository schoolClassRepository;

    @Autowired
    public StudentRESTController(StudentRepository studentRepository, SchoolClassRepository schoolClassRepository) {
        this.studentRepository = studentRepository;
        this.schoolClassRepository = schoolClassRepository;
    }

    @GetMapping("/studentListings/in/{schoolId}")
    public Iterable<Student> getStudents(@PathVariable Integer schoolId) {
        if (schoolId == null) {
            return studentRepository.findAll();
        } else {
            return Collections.emptyList();
        }
    }

}
