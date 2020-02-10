package com.rohanmorris.nova.Model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Qualification {
    @Column(name = "qualification_id", table = "teacher_qualification")
    private int qualification_id;

    public int getQualification_id() {
        return qualification_id;
    }

    public void setQualification_id(int qualification_id) {
        this.qualification_id = qualification_id;
    }
}