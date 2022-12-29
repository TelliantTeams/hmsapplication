package com.hmsapplication.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "patient")
public class Patient implements Serializable {
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
    private LocalDate pdob;

    @Column
    private Float pheight;

    @Column
    private Float pweight;

    @Column
    private Float pbp;



//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id",referencedColumnName = "id")
    @Column(name = "user_id")
    private int user_id;

    public Patient() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getPgender() {
        return pgender;
    }

    public void setPgender(String pgender) {
        this.pgender = pgender;
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }

    public Long getPcontact() {
        return pcontact;
    }

    public void setPcontact(Long pcontact) {
        this.pcontact = pcontact;
    }

    public LocalDate getPdob() {
        return pdob;
    }

    public void setPdob(LocalDate pdob) {
        this.pdob = pdob;
    }

    public Float getPheight() {
        return pheight;
    }

    public void setPheight(Float pheight) {
        this.pheight = pheight;
    }

    public Float getPweight() {
        return pweight;
    }

    public void setPweight(Float pweight) {
        this.pweight = pweight;
    }

    public Float getPbp() {
        return pbp;
    }

    public void setPbp(Float pbp) {
        this.pbp = pbp;
    }


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Patient(int id, String pname, int page, String pgender, String paddress, Long pcontact, LocalDate pdob, Float pheight, Float pweight, Float pbp, int user_id) {
        this.id = id;
        this.pname = pname;
        this.page = page;
        this.pgender = pgender;
        this.paddress = paddress;
        this.pcontact = pcontact;
        this.pdob = pdob;
        this.pheight = pheight;
        this.pweight = pweight;
        this.pbp = pbp;
        this.user_id = user_id;
    }
}