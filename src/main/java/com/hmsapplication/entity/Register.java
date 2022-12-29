package com.hmsapplication.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.Period;

@Entity
public class Register {

    @Id
    private int id;
    private String username;
    private String password;
    private LocalDate dob;
    private String email;
    private Long contact;

    private int age;

    private String gender;

    private String address;

    private Float height;

    private Float weight;

    private Float bp;


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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
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

    public int getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getBp() {
        return bp;
    }

    public void setBp(Float bp) {
        this.bp = bp;
    }

//    public Register(String username, String password, String dob, String email, Long contact, String address
//                   ) {
//        this.username = username;
//        this.password = password;
//        this.dob = dob;
//        this.email = email;
//        this.contact = contact;
//    }

    public Register(int id, String username, String password, LocalDate dob, String email, Long contact, int age,
                    String gender, String address, Float height, Float weight, Float bp) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.dob = dob;
        this.email = email;
        this.contact = contact;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.height = height;
        this.weight = weight;
        this.bp = bp;
    }
}
