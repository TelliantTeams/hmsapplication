package com.hmsapplication.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "doctor")
@NoArgsConstructor
public class Doctor implements Serializable {

     @Id
     @GeneratedValue
     private int id;

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

     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "user_id",referencedColumnName = "id")
     private Users users;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Doctor(int id, String dname, int age, Long contact, String address, String mail,
                  String qualification, String signature, Users users) {
        this.id = id;
        this.dname = dname;
        this.age = age;
        this.contact = contact;
        this.address = address;
        this.mail = mail;
        this.qualification = qualification;
        this.signature = signature;
        this.users = users;
    }
}
