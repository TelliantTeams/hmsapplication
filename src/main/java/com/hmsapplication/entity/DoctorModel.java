package com.hmsapplication.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "doctor")
@NoArgsConstructor
public class DoctorModel implements Serializable {
    @Id
    @GeneratedValue
    private int did;

    @Column
    private String dname;

    @Column
    private int age;

    @Column
    private Long contact;

    @Column
    private String address;

    @Column
    private String mail;

    @Column
    private String qualification;

    @Column
    private String signature;

    public DoctorModel(int did, String dname, int age, Long contact, String address,
                       String mail, String qualification, String signature) {
        this.did = did;
        this.dname = dname;
        this.age = age;
        this.contact = contact;
        this.address = address;
        this.mail = mail;
        this.qualification = qualification;
        this.signature = signature;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
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
}

