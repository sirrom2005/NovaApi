package com.rohanmorris.nova.Model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "accounts")
@SecondaryTable(name = "account_school", pkJoinColumns = @PrimaryKeyJoinColumn(name = "account_id"))
@SecondaryTable(name = "house_color_account", pkJoinColumns = @PrimaryKeyJoinColumn(name = "account_id"))
@SecondaryTable(name = "class_room_students", pkJoinColumns = @PrimaryKeyJoinColumn(name = "student_id"))
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false)
    private int account_id;
    @JsonIgnore
    private String username;
    @JsonIgnore
    private String password;
    private String firstname;
    private String middlename;
    private String lastname;
    private String gender;
    private String email;
    private String street;
    private String city_town;
    private String zip_code;
    private int parish_id;
    private int country_id;
    private String phone_home;
    private String phone_mobile;
    private String dob;
    private String enrollment_date;
    public int account_type;
    @JsonIgnore
    private int active;
    @JsonIgnore
    private String date_added;
    @Embedded()
    private AccountSchool accountschool;
    @Embedded()
    private HouseColor housecolor;
    @Embedded()
    private ClassRoomStudent classroom;
    @OneToMany()
    @JoinColumn(name = "account_id", insertable = false, updatable = false)
    private List<AccountExtracurricularActivity> account_extracurricular_activity;

    public Account() {
        this.setActive(1);
        this.setDate_added();
        this.setPassword("password");
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
     * @return the password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @param password the password to set
     */
    private void setPassword(String password) {
        StringBuffer sb = new StringBuffer();
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(password.getBytes());
            byte[] digest = messageDigest.digest();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 0xff)));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        this.password = sb.toString();
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
     * @return the account_type
     */
    public int getAccount_type() {
        return account_type;
    }

    /**
     * @param account_type the account_type to set
     */
    public void setAccount_type(int account_type) {
        this.account_type = account_type;
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
     * @return the date_added
     */
    public String getDate_added() {
        return this.date_added;
    }

    /**
     * @param date_added the date_added to set
     */
    private void setDate_added() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateobj = new Date();
        this.date_added = df.format(dateobj);
    }

    /**
     * @return the enrollment_date
     */
    public String getEnrollment_date() {
        return enrollment_date;
    }

    /**
     * @param enrollment_date the enrollment_date to set
     */
    public void setEnrollment_date(String enrollment_date) {
        this.enrollment_date = enrollment_date;
    }

    /**
     * @return the accountschool
     */
    public AccountSchool getAccountschool() {
        return accountschool;
    }

    /**
     * @param accountschool the accountschool to set
     */
    public void setAccountschool(AccountSchool accountschool) {
        this.accountschool = accountschool;
    }

    /**
     * @return the housecolor
     */
    public HouseColor getHousecolor() {
        return housecolor;
    }

    /**
     * @param housecolor the housecolor to set
     */
    public void setHousecolor(HouseColor housecolor) {
        this.housecolor = housecolor;
    }

    /**
     * @return the classroom
     */
    public ClassRoomStudent getClassroom() {
        return classroom;
    }

    /**
     * @param classroom the classroom to set
     */
    public void setClassroom(ClassRoomStudent classroom) {
        this.classroom = classroom;
    }

    /**
     * @return the account_extracurricular_activity
     */
    public List<AccountExtracurricularActivity> getAccount_extracurricular_activity() {
        return account_extracurricular_activity;
    }

    /**
     * @param account_extracurricular_activity the account_extracurricular_activity
     *                                         to set
     */
    public void setAccount_extracurricular_activity(
            List<AccountExtracurricularActivity> account_extracurricular_activity) {
        this.account_extracurricular_activity = account_extracurricular_activity;
    }
}