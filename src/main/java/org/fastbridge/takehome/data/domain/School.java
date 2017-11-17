/**
 * School
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/15/17
 */
package org.fastbridge.takehome.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author vivek
 */
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

    @Column
    private String stateShortCode;

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getStateShortCode() {
        return stateShortCode;
    }

    public void setStateShortCode(String stateShortCode) {
        this.stateShortCode = stateShortCode;
    }
}
