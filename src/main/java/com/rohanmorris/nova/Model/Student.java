package com.rohanmorris.nova.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "view_formlist")
@Immutable
public class Student {

    @Id
    private int account_id;
    private String username;
    private String firstname;
    private String middlename;
    private String lastname;
    private String gender;
    private String active;
    private String class_id;
    private String formclass;
    private String school_id;

    Student() {
    }

    /**
     * @param account_id
     * @param username
     * @param firstname
     * @param middlename
     * @param lastname
     * @param gender
     * @param active
     * @param class_id
     * @param formclass
     * @param school_id
     */
    public Student(int account_id, String username, String firstname, String middlename, String lastname, String gender,
            String active, String class_id, String formclass, String school_id) {
        this.account_id = account_id;
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

    /**
     * @return the account_id
     */
    public int getAccount_id() {
        return account_id;
    }

    /**
     * @param account_id the account_id to set
     */
    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the middlename
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * @param middlename the middlename to set
     */
    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the active
     */
    public String getActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(String active) {
        this.active = active;
    }

    /**
     * @return the class_id
     */
    public String getClass_id() {
        return class_id;
    }

    /**
     * @param class_id the class_id to set
     */
    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    /**
     * @return the formclass
     */
    public String getFormclass() {
        return formclass;
    }

    /**
     * @param formclass the formclass to set
     */
    public void setFormclass(String formclass) {
        this.formclass = formclass;
    }

    /**
     * @return the school_id
     */
    public String getSchool_id() {
        return school_id;
    }

    /**
     * @param school_id the school_id to set
     */
    public void setSchool_id(String school_id) {
        this.school_id = school_id;
    }
}