package com.rohanmorris.nova.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "view_formlist")
@Immutable
public class FormList {
    @Id
    private String student_id;
    private String username;
    private String firstname;
    private String middlename;
    private String lastname;
    private String gender;
    private String active;
    private String class_id;
    private String formclass;
    private String school_id;

    public FormList(){}

    public FormList(String student_id, String username, String firstname, String middlename, String lastname,
            String gender, String active, String class_id, String formclass, String school_id) {
        this.student_id = student_id;
        this.username = username;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.gender = gender;
        this.active = active;
        this.class_id = class_id;
        this.formclass = formclass;
        this.school_id = school_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public String getFormclass() {
        return formclass;
    }

    public void setFormclass(String formclass) {
        this.formclass = formclass;
    }

    public String getSchool_id() {
        return school_id;
    }

    public void setSchool_id(String school_id) {
        this.school_id = school_id;
    }
}

