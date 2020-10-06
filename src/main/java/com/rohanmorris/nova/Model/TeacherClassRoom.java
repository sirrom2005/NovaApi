package com.rohanmorris.nova.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "view_teacher_subject_class")
public class TeacherClassRoom {
    @Id
    @JsonIgnore
    public long id;
    private long teacher_id;
    private long class_room_id;
    private long subject_id;
    private String subject;
    private String class_room;

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
     * @return the class_room_id
     */
    public long getClass_room_id() {
        return class_room_id;
    }

    /**
     * @param class_room_id the class_room_id to set
     */
    public void setClass_room_id(long class_room_id) {
        this.class_room_id = class_room_id;
    }

    /**
     * @return the subject_id
     */
    public long getSubject_id() {
        return subject_id;
    }

    /**
     * @param subject_id the subject_id to set
     */
    public void setSubject_id(long subject_id) {
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

    /**
     * @return the class_room
     */
    public String getClass_room() {
        return class_room;
    }

    /**
     * @param class_room the class_room to set
     */
    public void setClass_room(String class_room) {
        this.class_room = class_room;
    }
}