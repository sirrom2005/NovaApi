package com.rohanmorris.nova.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentInfo extends Person {
    private String email;
    private String street;
    private String city_town;
    private String zip_code;
    private String parish_id;
    private String country_id;
    private String phone_home;
    private String phone_mobile;
    private String dob;
    private String active;
    private String house_color_id;
    private String house_color;

    

    /**
     * @param id
     * @param userName
     * @param firstName
     * @param middleName
     * @param lastName
     * @param gender
     * @param email
     * @param street
     * @param city_town
     * @param zip_code
     * @param parish_id
     * @param country_id
     * @param phone_home
     * @param phone_mobile
     * @param dob
     * @param active
     * @param house_color_id
     * @param house_color
     */
    public StudentInfo(@JsonProperty("student_id") int id, @JsonProperty("username") String userName,
            @JsonProperty("firstname") String firstName, @JsonProperty("middlename") String middleName,
            @JsonProperty("lastname") String lastName, @JsonProperty("gender") String gender, String email,
            String street, String city_town, String zip_code, String parish_id, String country_id, String phone_home,
            String phone_mobile, String dob, String active, String house_color_id, String house_color) {
        super(id, userName, firstName, middleName, lastName, gender);
        this.email = email;
        this.street = street;
        this.city_town = city_town;
        this.zip_code = zip_code;
        this.parish_id = parish_id;
        this.country_id = country_id;
        this.phone_home = phone_home;
        this.phone_mobile = phone_mobile;
        this.dob = dob;
        this.active = active;
        this.house_color_id = house_color_id;
        this.house_color = house_color;
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
     * @return the house_color_id
     */
    public String getHouse_color_id() {
        return house_color_id;
    }

    /**
     * @param house_color_id the house_color_id to set
     */
    public void setHouse_color_id(String house_color_id) {
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
}