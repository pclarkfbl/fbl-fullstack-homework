/**
 * SchoolClass
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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * @author vivek
 */
@lombok.Data
@Entity
public class SchoolClass {

    @Id
    @GeneratedValue
    @Column(name = "school_class_id")
    private Long schoolClassId;

    @Column
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "school_id", referencedColumnName = "school_id")
    private School school;

    @ManyToMany
    private Set<Student> enrolledStudents;

    @ManyToMany
    private Set<Teacher> enrolledTeachers;

}
