package com.rohanmorris.nova.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subjects")
public class Subject {
    @Id
    @Column(name = "id")
    private int subject_id;
    private String subject;

    /**
     * 
     */
    public Subject() {
    }

    /**
     * @param subject_id
     * @param subject
     */
    public Subject(int subject_id, String subject) {
        this.subject_id = subject_id;
        this.subject = subject;
    }

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
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
}