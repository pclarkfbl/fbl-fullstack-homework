/**
 * StudentController
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/16/17
 */
package org.fastbridge.takehome.controller;

import org.fastbridge.takehome.repository.SchoolRepository;
import org.fastbridge.takehome.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author vivek
 */
@Controller
public class StudentController {

    private final SchoolRepository schoolRepository;
    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(SchoolRepository schoolRepository, StudentRepository studentRepository) {
        this.schoolRepository = schoolRepository;
        this.studentRepository = studentRepository;
    }

    @GetMapping("/studentListings")
    public String getStudentListings(ModelMap model) {
        model.put("schools", schoolRepository.findAll());
        model.put("students", studentRepository.findAll());
        return "studentListings";
    }

}
