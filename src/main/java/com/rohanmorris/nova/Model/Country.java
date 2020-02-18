package com.rohanmorris.nova.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "odb_country")
public class Country {
    @Id
    @Column(name = "country_id")
    public int id;
    public String name;
    @OneToMany()
    @JoinColumn(name = "country_id")
    private List<CountryState> countrystate;
    
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

    public List<CountryState> getCountrystate() {
        return countrystate;
    }

    public void setCountrystate(List<CountryState> countrystate) {
        this.countrystate = countrystate;
    }
}