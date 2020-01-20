package com.rohanmorris.nova.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({ "dob" })
public class Student extends Person {
    private String formClass;

    /**
     * @param formClass
     */
    public Student(@JsonProperty("student_id") int id, @JsonProperty("username") String userName,
            @JsonProperty("firstname") String firstName, @JsonProperty("middlename") String middleName,
            @JsonProperty("lastname") String lastName, @JsonProperty("gender") String gender,
            @JsonProperty("formclass") String formClass) {
        super(id, userName, firstName, middleName, lastName, gender);
        this.formClass = formClass;
    }

    /**
     * @return the formClass
     */
    public String getFormClass() {
        return formClass;
    }

    /**
     * @param formClass the formClass to set
     */
    public void setFormClass(String formClass) {
        this.formClass = formClass;
    }
}