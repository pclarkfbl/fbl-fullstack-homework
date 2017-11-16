/**
 * StudentRESTController
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/16/17
 */
package org.fastbridge.takehome.controller;

import java.util.Collections;

import org.fastbridge.takehome.domain.Student;
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

    @Autowired
    public StudentRESTController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/studentListings/in/{schoolId}")
    public Iterable<Student> getStudents(@PathVariable Integer schoolId) {
        if (schoolId == null) {
            return studentRepository.findAll();
        }
        return Collections.emptyList();
    }

}
