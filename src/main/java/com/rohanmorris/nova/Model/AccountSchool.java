package com.rohanmorris.nova.Model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AccountSchool
{
    @Column(name = "school_id", table = "account_school")
    private int school_id;

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