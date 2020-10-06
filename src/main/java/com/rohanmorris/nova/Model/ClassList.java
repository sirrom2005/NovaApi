package com.rohanmorris.nova.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "view_class_list")
@Immutable
public class ClassList {
    @Id
    private long account_id;
    private String firstname;
    private String middlename;
    private String lastname;
    @Column(name = "class_id")
    private long classid;
    private String class_name;

    /**
     * @return the account_id
     */
    public long getAccount_id() {
        return account_id;
    }

    /**
     * @param account_id the account_id to set
     */
    public void setAccount_id(long account_id) {
        this.account_id = account_id;
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
     * @return the classid
     */
    public long getClassid() {
        return classid;
    }

    /**
     * @param classid the classid to set
     */
    public void setClassid(long classid) {
        this.classid = classid;
    }
}