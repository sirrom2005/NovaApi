package com.rohanmorris.nova.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UpcomingExam {
    @Id
    private long id;
    private String name;
    private String teacher;
    private String exam_type;
    private String class_name;
    private String subject;
    private int allow_retry;
    private String exam_expire_date;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the teacher
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * @param teacher the teacher to set
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    /**
     * @return the exam_type
     */
    public String getExam_type() {
        return exam_type;
    }

    /**
     * @param exam_type the exam_type to set
     */
    public void setExam_type(String exam_type) {
        this.exam_type = exam_type;
    }

    /**
     * @return the class_name
     */
    public String getClass_name() {
        return class_name;
    }

    /**
     * @param class_name the class_name to set
     */
    public void setClass_name(String class_name) {
        this.class_name = class_name;
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

    /**
     * @return the allow_retry
     */
    public int getAllow_retry() {
        return allow_retry;
    }

    /**
     * @param allow_retry the allow_retry to set
     */
    public void setAllow_retry(int allow_retry) {
        this.allow_retry = allow_retry;
    }

    /**
     * @return the exam_expire_date
     */
    public String getExam_expire_date() {
        return exam_expire_date;
    }

    /**
     * @param exam_expire_date the exam_expire_date to set
     */
    public void setExam_expire_date(String exam_expire_date) {
        this.exam_expire_date = exam_expire_date;
    }
}
