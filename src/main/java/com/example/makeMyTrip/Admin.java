package com.example.makeMyTrip;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
    private String username;
    private String password;
    @Id
    private int admin_id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
