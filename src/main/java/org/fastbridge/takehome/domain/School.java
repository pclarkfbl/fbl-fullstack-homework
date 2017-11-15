/**
 * School
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/15/17
 */
package org.fastbridge.takehome.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author vivek
 */
@lombok.Data
@Entity
public class School {

    @Id
    @GeneratedValue
    @Column(name = "school_id")
    private Integer schoolId;

    @Column
    private Integer districtId;

    @Column
    private String schoolName;

    @OneToMany
    Set<SchoolClass> classes;


}
