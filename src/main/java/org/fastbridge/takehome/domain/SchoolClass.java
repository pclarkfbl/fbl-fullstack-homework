/**
 * SchoolClass
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/15/17
 */
package org.fastbridge.takehome.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    private String course;

    @Column
    private String gradeLevel;

    @ManyToOne
    @JoinColumn(name = "school_id", referencedColumnName = "school_id")
    private School school;

}
