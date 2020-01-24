package com.rohanmorris.nova.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject_school")
public class SubjectSchool {
    @Id
    private int subject_id;
    private int school_id;

    /**
     * @return the subject_id
     */
    public int getSubject_id() {
        return subject_id;
    }

    /**
     * @param subject_id the subject_id to set
     */
    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    /**
     * @return the school_id
     */
    public int getSchool_id() {
        return school_id;
    }

    /**
     * @param school_id the school_id to set
     */
    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }
}