package com.rohanmorris.nova.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "examination_grade")
public class ExaminationGrade {
    @Id
    private long exam_id;
    private long student_id;
    private String subject;
    private String grade;

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
}