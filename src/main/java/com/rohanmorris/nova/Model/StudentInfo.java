package com.rohanmorris.nova.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "view_student_info")
@Immutable
public class StudentInfo {
    @Id
    private int account_id;
    private String username;
    private String firstname;
    private String middlename;
    private String lastname;
    private String gender;
    private String email;
    private String street;
    private String city_town;
    private String zip_code;
    private String parish_id;
    private String country_id;
    private String phone_home;
    private String phone_mobile;
    private String dob;
    private int active;
    private int house_color_id;
    private String house_color;
    private int class_id;
    private int school_id;

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
     * @return the parish_id
     */
    public String getParish_id() {
        return parish_id;
    }

    /**
     * @param parish_id the parish_id to set
     */
    public void setParish_id(String parish_id) {
        this.parish_id = parish_id;
    }

    /**
     * @return the country_id
     */
    public String getCountry_id() {
        return country_id;
    }

    /**
     * @param country_id the country_id to set
     */
    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    /**
     * @return the phone_home
     */
    public String getPhone_home() {
        return phone_home;
    }

    /**
     * @param phone_home the phone_home to set
     */
    public void setPhone_home(String phone_home) {
        this.phone_home = phone_home;
    }

    /**
     * @return the phone_mobile
     */
    public String getPhone_mobile() {
        return phone_mobile;
    }

    /**
     * @param phone_mobile the phone_mobile to set
     */
    public void setPhone_mobile(String phone_mobile) {
        this.phone_mobile = phone_mobile;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the active
     */
    public int getActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(int active) {
        this.active = active;
    }

    /**
     * @return the house_color_id
     */
    public int getHouse_color_id() {
        return house_color_id;
    }

    /**
     * @param house_color_id the house_color_id to set
     */
    public void setHouse_color_id(int house_color_id) {
        this.house_color_id = house_color_id;
    }

    /**
     * @return the house_color
     */
    public String getHouse_color() {
        return house_color;
    }

    /**
     * @param house_color the house_color to set
     */
    public void setHouse_color(String house_color) {
        this.house_color = house_color;
    }

    /**
     * @return the class_id
     */
    public int getClass_id() {
        return class_id;
    }

    /**
     * @param class_id the class_id to set
     */
    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    /**
     * @return the school_id
     */
    public int getSchool_id() {
        return school_id;
    }

    /**
     * @param school_id the school_id to set
     */
    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }
}