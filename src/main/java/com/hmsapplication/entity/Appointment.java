package com.hmsapplication.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.time.LocalDate;


@Data
@Entity
@Table(name = "appointment")
@NoArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private LocalDate visiting_date;

    @Column
    private String reason;

    @Column
    private String status;

    @Column
    private int patient_id;

    @Column
    private int visiting_doctor_id;

    @Column
    private int approved_id;


    //fk patient_id
    //fk visiting_doctor_id
    //fk approved_id


    public Appointment(int id, LocalDate visiting_date, String reason, String status,
                       int patient_id, int visiting_doctor_id, int approved_id) {
        this.id = id;
        this.visiting_date = visiting_date;
        this.reason = reason;
        this.status = status;
        this.patient_id = patient_id;
        this.visiting_doctor_id = visiting_doctor_id;
        this.approved_id = approved_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getVisiting_date() {
        return visiting_date;
    }

    public void setVisiting_date(LocalDate visiting_date) {
        this.visiting_date = visiting_date;
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

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getVisiting_doctor_id() {
        return visiting_doctor_id;
    }

    public void setVisiting_doctor_id(int visiting_doctor_id) {
        this.visiting_doctor_id = visiting_doctor_id;
    }

    public int getApproved_id() {
        return approved_id;
    }

    public void setApproved_id(int approved_id) {
        this.approved_id = approved_id;
    }
}
