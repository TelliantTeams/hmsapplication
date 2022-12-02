package com.hmsapplication.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "patient_table")
public class PatientModel {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String pname;

    @Column
    private int page;

    @Column
    private String pgender;

    @Column
    private String paddress;

    @Column
    private Long pcontact;

    @Column
    private String pdob;

    @Column
    private Float pheight;

    @Column
    private Float pweight;

    @Column(name="puserid")
    private int puserid;
}