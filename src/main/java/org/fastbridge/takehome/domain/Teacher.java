/**
 * Teacher
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/15/17
 */
package org.fastbridge.takehome.domain;

import java.util.Set;

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
@lombok.Data
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

    @ManyToMany
    @JoinTable(name = "teacher_class_enrollment",
            joinColumns = @JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "school_class_id", referencedColumnName = "school_class_id"))
    private Set<SchoolClass> enrolledClasses;

}
