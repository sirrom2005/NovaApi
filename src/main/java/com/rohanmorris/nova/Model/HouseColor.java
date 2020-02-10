package com.rohanmorris.nova.Model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class HouseColor {
    @Column(name = "house_color_id", table = "house_color_account")
    private int house_color_id;

    /**
     * @return the house_color_id
     */
    public int getHouse_color_id() {
        return house_color_id;
    }

    /**
     * @param house_color_id the house_color_id to set
     */
    public void setHouse_color_id(int house_color_id) {
        this.house_color_id = house_color_id;
    }
}