package com.rohanmorris.nova.Model;

public class Person {

    private String account_id;
    private String username;
    private String firstname;
    private String middlename;
    private String lastname;
    private String gender;
    private String dob;
    private String active;

    public enum Gender {
        Male, Female, Other
    };

    public enum AccountType {
        Admin, Teacher, Parent, Student
    }

    public Person(){}

    public Person(String account_id, String username, String firstname, String middlename, String lastname,
            String gender, String dob, String active) {
        this.account_id = account_id;
        this.username = username;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.gender = gender;
        this.dob = dob;
        this.active = active;
    }

    public Person(int id, String userName2, String firstName2, String middleName2, String lastName2, String gender2) {
	}

	public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}