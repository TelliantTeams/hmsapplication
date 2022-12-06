package com.hmsapplication.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "patient")
@NoArgsConstructor
public class PatientModel implements Serializable {
    @Id
    @GeneratedValue
    private int pid;

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

    public PatientModel(int pid, String pname, int page, String pgender,
                        String paddress, Long pcontact, String pdob, Float pheight, Float pweight, Float pbp) {
        this.pid = pid;
        this.pname = pname;
        this.page = page;
        this.pgender = pgender;
        this.paddress = paddress;
        this.pcontact = pcontact;
        this.pdob = pdob;
        this.pheight = pheight;
        this.pweight = pweight;
        this.pbp = pbp;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
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
}