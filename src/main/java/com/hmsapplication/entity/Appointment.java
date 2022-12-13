package com.hmsapplication.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

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

    //fk patient_id
    //fk visiting_doctor_id
    //fk approved_id


}
