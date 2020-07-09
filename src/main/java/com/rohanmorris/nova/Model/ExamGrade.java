package com.rohanmorris.nova.Model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "exams_results")
public class ExamGrade {
    @Id
    private long exam_id;
    private long student_id;
    private float grade;
    @JsonIgnore
    @Column(updatable = false)
    private String date_added;
    private String date_updated;

    /**
     * 
     */
    public ExamGrade() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateobj = new Date();
        setDate_added(df.format(dateobj));
        setDate_updated(df.format(dateobj));
    }

    /**
     * @return the exam_id
     */
    public long getExam_id() {
        return exam_id;
    }

    /**
     * @param exam_id the exam_id to set
     */
    public void setExam_id(long exam_id) {
        this.exam_id = exam_id;
    }

    /**
     * @return the student_id
     */
    public long getStudent_id() {
        return student_id;
    }

    /**
     * @param student_id the student_id to set
     */
    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }

    /**
     * @return the grade
     */
    public float getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(float grade) {
        this.grade = grade;
    }

    /**
     * @return the date_added
     */
    public String getDate_added() {
        return date_added;
    }

    /**
     * @param date_added the date_added to set
     */
    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    /**
     * @return the date_updated
     */
    public String getDate_updated() {
        return date_updated;
    }

    /**
     * @param date_updated the date_updated to set
     */
    public void setDate_updated(String date_updated) {
        this.date_updated = date_updated;
    }
}