package com.rohanmorris.nova.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "schools")
public class School {
    @Id
    @Column(name = "id")
    private int school_id;
    private String name;
    private String url_name;
    private String street;
    private String city_town;
    private String zip_code;
    private int parish_id;
    private int country_id;
    private String phone_num1;
    private String phone_num2;
    private String fax;
    private String email;
    private String logo;
    private String motto;
    private String about_school;
    private int enable;
    private int show_on_site;
    private String date_added;
    @OneToMany()
    @JoinTable(name = "subject_school", joinColumns = @JoinColumn(name = "school_id"), inverseJoinColumns = @JoinColumn(name = "subject_id"))
    private List<Subject> subject_list = new ArrayList<Subject>();

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

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the url_name
     */
    public String getUrl_name() {
        return url_name;
    }

    /**
     * @param url_name the url_name to set
     */
    public void setUrl_name(String url_name) {
        this.url_name = url_name;
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
    public int getParish_id() {
        return parish_id;
    }

    /**
     * @param parish_id the parish_id to set
     */
    public void setParish_id(int parish_id) {
        this.parish_id = parish_id;
    }

    /**
     * @return the country_id
     */
    public int getCountry_id() {
        return country_id;
    }

    /**
     * @param country_id the country_id to set
     */
    public void setCountry_id(int country_id) {
        this.country_id = country_id;
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
     * @return the about_school
     */
    public String getAbout_school() {
        return about_school;
    }

    /**
     * @param about_school the about_school to set
     */
    public void setAbout_school(String about_school) {
        this.about_school = about_school;
    }

    /**
     * @return the enable
     */
    public int getEnable() {
        return enable;
    }

    /**
     * @param enable the enable to set
     */
    public void setEnable(int enable) {
        this.enable = enable;
    }

    /**
     * @return the show_on_site
     */
    public int getShow_on_site() {
        return show_on_site;
    }

    /**
     * @param show_on_site the show_on_site to set
     */
    public void setShow_on_site(int show_on_site) {
        this.show_on_site = show_on_site;
    }

    /**
     * @return the date_added
     */
    public String getDate_added() {
        return date_added;
    }

    /**
     * @param date_added the date_added to set
     */
    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    /**
     * @return the subject_list
     */
    public List<Subject> getSubject_list() {
        return subject_list;
    }

    /**
     * @param subject_list the subject_list to set
     */
    public void setSubject_list(List<Subject> subject_list) {
        this.subject_list = subject_list;
    }
}