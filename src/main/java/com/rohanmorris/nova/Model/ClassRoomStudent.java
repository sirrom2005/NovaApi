package com.rohanmorris.nova.Model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ClassRoomStudent {

    @Column(name = "class_room_id", table = "class_room_students")
    private int class_room_id;

    /**
     * @return the class_room_id
     */
    public int getClass_room_id() {
        return class_room_id;
    }

    /**
     * @param class_room_id the class_room_id to set
     */
    public void setClass_room_id(int class_room_id) {
        this.class_room_id = class_room_id;
    }
}