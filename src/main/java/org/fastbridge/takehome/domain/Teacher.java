/**
 * Teacher
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
public class Teacher {

    @Id
    @GeneratedValue
    @Column(name = "teacher_id")
    private Integer teacherId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String teacherEmail;

    /**
     * Classes ({@link SchoolClass}) this teacher is responsible for
     */
    @ManyToMany
    @JoinTable(name = "teacher_class_enrollment",
            joinColumns = @JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "school_class_id", referencedColumnName = "school_class_id"))
    private List<SchoolClass> enrolledClasses;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
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

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public List<SchoolClass> getEnrolledClasses() {
        return enrolledClasses;
    }

    public void setEnrolledClasses(List<SchoolClass> enrolledClasses) {
        this.enrolledClasses = enrolledClasses;
    }
}
