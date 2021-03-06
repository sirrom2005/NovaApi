package com.rohanmorris.nova.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "obd_county_zone")
public class CountryState {
    @Id
    @Column(name = "zone_id")
    private int  state_id;
    @Column(name = "country_id")
    private int countryid;
    private String name;

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountry_id() {
        return countryid;
    }

    public void setCountry_id(int countryid) {
        this.countryid = countryid;
    }
}