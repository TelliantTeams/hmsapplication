package com.hmsapplication.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "patient")
@NoArgsConstructor
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
    private String pdob;

    @Column
    private Float pheight;

    @Column
    private Float pweight;

    @Column
    private Float pbp;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private Users user;


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

    public String getPdob() {
        return pdob;
    }

    public void setPdob(String pdob) {
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

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Patient(int id, String pname, int page, String pgender, String paddress, Long pcontact, String pdob, Float pheight, Float pweight, Float pbp, Users user) {
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
        this.user = user;
    }
}