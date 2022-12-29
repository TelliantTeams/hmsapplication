package com.hmsapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Registerdoc {

    @Id
    private int id;

    private String username;

    private String password;

    private String dname;

    private int age;

    private Long contact;

    private String address;

    private String mail;

    private String qualification;

    private String signature;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Registerdoc(int id,String username, String password, String dname, int age,
                       Long contact, String address, String mail, String qualification, String signature) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.dname = dname;
        this.age = age;
        this.contact = contact;
        this.address = address;
        this.mail = mail;
        this.qualification = qualification;
        this.signature = signature;
    }
}
