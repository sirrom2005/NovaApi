package com.rohanmorris.nova.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * StudentBehavior
 */
@Entity
@Table(name = "student_conduct_behavior")
public class StudentBehavior {
    @Id
    private int id;
    private String student_id;
    @OneToOne
    @JoinColumn(name = "class_id")
    private ClassRoom class_room;
    @OneToOne
    @JoinColumn(name = "conduct_id")
    private StudentConduct conduct;
    private String comments;
    private String teacher_id;
    private String date_added;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public ClassRoom getClass_room() {
        return class_room;
    }

    public void setClass_room(ClassRoom class_room) {
        this.class_room = class_room;
    }

    public StudentConduct getConduct() {
        return conduct;
    }

    public void setConduct(StudentConduct conduct) {
        this.conduct = conduct;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }    
}