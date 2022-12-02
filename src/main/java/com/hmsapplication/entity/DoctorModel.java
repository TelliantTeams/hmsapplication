package com.hmsapplication.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "doctor_table")
public class DoctorModel {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String dname;

    @Column
    private int dage;

    @Column
    private Long dcontact;

    @Column
    private String daddress;

    @Column
    private String dmail;

    @Column
    private String dqualification;

    @Column
    private int duserid;

    @Column
    private String dsignature;

}
