package com.optics.rest.domain;

import com.optics.rest.abstracts.BaseIdentifiable;

import javax.persistence.Entity;

@Entity
public class Player extends BaseIdentifiable<Player> {

    private String firstName;

    private String lastName;

    private boolean vip;

    public String getFirstName() {
        return firstName;
    }

    public Player setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Player setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public boolean isVip() {
        return vip;
    }

    public Player setVip(boolean vip) {
        this.vip = vip;
        return this;
    }
}
