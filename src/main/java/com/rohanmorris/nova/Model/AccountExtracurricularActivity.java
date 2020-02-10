package com.rohanmorris.nova.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "account_ex_activity")
public class AccountExtracurricularActivity {

    @Id
    @JsonIgnore
    private int account_id;
    private int extracurricular_activity_id;

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
     * @return the extracurricular_activity_id
     */
    public int getExtracurricular_activity_id() {
        return extracurricular_activity_id;
    }

    /**
     * @param extracurricular_activity_id the extracurricular_activity_id to set
     */
    public void setExtracurricular_activity_id(int extracurricular_activity_id) {
        this.extracurricular_activity_id = extracurricular_activity_id;
    }
}