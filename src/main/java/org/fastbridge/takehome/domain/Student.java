/**
 * Student
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/15/17
 */
package org.fastbridge.takehome.domain;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * @author vivek
 */
@Entity
public class Student {

    @GeneratedValue
    @Id
    @Column(name = "student_id")
    private Integer studentId;

    @Column
    private String studentStateId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    /**
     * Classes {@link SchoolClass} this student is enrolled in
     */
    @ManyToMany
    @JoinTable(name = "student_class_enrollment",
            joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "school_class_id", referencedColumnName = "school_class_id"))
    private List<SchoolClass> classEnrollments;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentStateId() {
        return studentStateId;
    }

    public void setStudentStateId(String studentStateId) {
        this.studentStateId = studentStateId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<SchoolClass> getClassEnrollments() {
        return classEnrollments;
    }

    public void setClassEnrollments(List<SchoolClass> classEnrollments) {
        this.classEnrollments = classEnrollments;
    }
}
