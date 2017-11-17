/**
 * StudentController
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/16/17
 */
package org.fastbridge.takehome.controller;

import org.fastbridge.takehome.data.service.SchoolService;
import org.fastbridge.takehome.data.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author vivek
 */
@Controller
public class StudentController {

    private final SchoolService schoolService;
    private final StudentService studentService;

    @Autowired
    public StudentController(SchoolService schoolService, StudentService studentService) {
        this.schoolService = schoolService;
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String getStudentListings(ModelMap model) {
        model.put("schools", schoolService.getAllSchools());
        model.put("students", studentService.getAllStudents());
        return "studentListings";
    }

}
