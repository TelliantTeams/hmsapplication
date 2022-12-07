package com.hmsapplication.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Register {

    @Id
    private int id;
    private String username;
    private String password;
    private String dob;
    private String email;
    private Long contact;

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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }

    public Register(String username, String password, String dob, String email, Long contact) {
        this.username = username;
        this.password = password;
        this.dob = dob;
        this.email = email;
        this.contact = contact;
    }
}
