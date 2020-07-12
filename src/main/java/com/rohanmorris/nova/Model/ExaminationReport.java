package com.rohanmorris.nova.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "examination_info")
public class ExaminationReport {
    @Id
    private long account_id;
    private String student_name;
    private String school_name;
    private String street;
    private String city_town;
    private String zip_code;
    private String parish;
    private String country;
    private String phone_num1;
    private String phone_num2;
    private String fax;
    private String email;
    private String logo;
    private String motto;
    private String class_room;
    @OneToMany()
    @JoinColumn(name = "student_id")
    private List<ExaminationGrade> examination_grade = new ArrayList<ExaminationGrade>();;

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
     * @return the student_name
     */
    public String getStudent_name() {
        return student_name;
    }

    /**
     * @param student_name the student_name to set
     */
    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    /**
     * @return the school_name
     */
    public String getSchool_name() {
        return school_name;
    }

    /**
     * @param school_name the school_name to set
     */
    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city_town
     */
    public String getCity_town() {
        return city_town;
    }

    /**
     * @param city_town the city_town to set
     */
    public void setCity_town(String city_town) {
        this.city_town = city_town;
    }

    /**
     * @return the zip_code
     */
    public String getZip_code() {
        return zip_code;
    }

    /**
     * @param zip_code the zip_code to set
     */
    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    /**
     * @return the parish
     */
    public String getParish() {
        return parish;
    }

    /**
     * @param parish the parish to set
     */
    public void setParish(String parish) {
        this.parish = parish;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the phone_num1
     */
    public String getPhone_num1() {
        return phone_num1;
    }

    /**
     * @param phone_num1 the phone_num1 to set
     */
    public void setPhone_num1(String phone_num1) {
        this.phone_num1 = phone_num1;
    }

    /**
     * @return the phone_num2
     */
    public String getPhone_num2() {
        return phone_num2;
    }

    /**
     * @param phone_num2 the phone_num2 to set
     */
    public void setPhone_num2(String phone_num2) {
        this.phone_num2 = phone_num2;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * @param logo the logo to set
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * @return the motto
     */
    public String getMotto() {
        return motto;
    }

    /**
     * @param motto the motto to set
     */
    public void setMotto(String motto) {
        this.motto = motto;
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

    /**
     * @return the examination_grade
     */
    public List<ExaminationGrade> getExamination_grade() {
        return examination_grade;
    }

    /**
     * @param examination_grade the examination_grade to set
     */
    public void setExamination_grade(List<ExaminationGrade> examination_grade) {
        this.examination_grade = examination_grade;
    }
}