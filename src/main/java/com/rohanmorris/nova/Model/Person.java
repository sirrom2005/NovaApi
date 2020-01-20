package com.rohanmorris.nova.Model;

public class Person {
    private int id;
    private String UserName;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String Gender;
    private String DOB;

    public enum Gender {
        Male, Female, Other
    };

    public enum AccountType {
        Admin, Teacher, Parent, Student
    }

    /**
     * @param id
     * @param userName
     * @param firstName
     * @param middleName
     * @param lastName
     * @param Gender
     */
    public Person(int id, String userName, String firstName, String middleName, String lastName, String gender) {
        this.id = id;
        this.UserName = userName;
        this.FirstName = firstName;
        this.MiddleName = middleName;
        this.LastName = lastName;
        this.Gender = gender;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    /**
     * @return the middleName
     */
    public String getMiddleName() {
        return MiddleName;
    }

    /**
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        LastName = lastName;
    }

    /**
     * @return the dOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param dOB the dOB to set
     */
    public void setDOB(String dob) {
        DOB = dob;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        UserName = userName;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        Gender = gender;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    };
}