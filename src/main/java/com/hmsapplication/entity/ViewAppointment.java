package com.hmsapplication.entity;


import lombok.Data;

import java.time.LocalDate;

@Data
public class ViewAppointment {

    private int id;
    private String pname;

    private LocalDate visiting_date;

    private String dname;

    private String reason;

    private String status;

    public ViewAppointment(int id,String pname, LocalDate visiting_date, String dname, String reason, String status) {
        this.id = id;
        this.pname = pname;
        this.visiting_date = visiting_date;
        this.dname = dname;
        this.reason = reason;
        this.status = status;
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

    public LocalDate getVisiting_date() {
        return visiting_date;
    }

    public void setVisiting_date(LocalDate visiting_date) {
        this.visiting_date = visiting_date;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
