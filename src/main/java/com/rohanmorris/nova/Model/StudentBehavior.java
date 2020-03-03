package com.rohanmorris.nova.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * StudentBehavior
 */
@Entity
@Table(name = "student_conduct_behavior")
public class StudentBehavior {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long student_id;
    @OneToOne
    @JoinColumn(name = "class_id")
    private ClassRoom class_room;
    @OneToOne
    @JoinColumn(name = "conduct_id")
    private StudentConduct conduct;
    private String comments;
    private long teacher_id;
    private String date_added;
    
    public StudentBehavior() {
        this.setDate_added();
    }

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
     * @return the class_room
     */
    public ClassRoom getClass_room() {
        return class_room;
    }

    /**
     * @param class_room the class_room to set
     */
    public void setClass_room(ClassRoom class_room) {
        this.class_room = class_room;
    }

    /**
     * @return the conduct
     */
    public StudentConduct getConduct() {
        return conduct;
    }

    /**
     * @param conduct the conduct to set
     */
    public void setConduct(StudentConduct conduct) {
        this.conduct = conduct;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return the teacher_id
     */
    public long getTeacher_id() {
        return teacher_id;
    }

    /**
     * @param teacher_id the teacher_id to set
     */
    public void setTeacher_id(long teacher_id) {
        this.teacher_id = teacher_id;
    }

    /**
     * @return the date_added
     */
    public String getDate_added() {
        return date_added;
    }

    private void setDate_added() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateobj = new Date();
        this.date_added = df.format(dateobj);
    }
}