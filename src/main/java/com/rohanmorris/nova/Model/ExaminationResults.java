package com.rohanmorris.nova.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "view_examination_results")
public class ExaminationResults {
    @Id
    private long exam_id;
    private long student_id;
    private String teacher;
    private String subject;
    private String grade;
    private String exam_type;
    private String class_name;
    private long class_id;
    private String date_completed;

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
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
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
     * @return the class_id
     */
    public long getClass_id() {
        return class_id;
    }

    /**
     * @param class_id the class_id to set
     */
    public void setClass_id(long class_id) {
        this.class_id = class_id;
    }

    /**
     * @return the date_completed
     */
    public String getDate_completed() {
        return date_completed;
    }

    /**
     * @param date_completed the date_completed to set
     */
    public void setDate_completed(String date_completed) {
        this.date_completed = date_completed;
    }
}