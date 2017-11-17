/**
 * StudentRESTController
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/16/17
 */
package org.fastbridge.takehome.controller;

import java.util.Collections;

import org.fastbridge.takehome.data.domain.Student;
import org.fastbridge.takehome.data.service.SchoolClassService;
import org.fastbridge.takehome.data.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vivek
 */
@RestController
public class StudentRESTController {

    private final StudentService studentService;

    private final SchoolClassService schoolClassService;

    @Autowired
    public StudentRESTController(StudentService studentService, SchoolClassService schoolClassService) {
        this.studentService = studentService;
        this.schoolClassService = schoolClassService;
    }

    @GetMapping("/students/in/school/{schoolId}")
    public Iterable<Student> getStudents(@PathVariable Integer schoolId) {
        if (schoolId == null || schoolId == -999) {
            return studentService.getAllStudents();
        } else {
            return Collections.emptyList();
        }
    }

}
