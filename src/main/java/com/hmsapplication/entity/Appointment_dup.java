package com.hmsapplication.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@Table(name = "appointment_dup")
public class Appointment_dup implements Serializable{
    @Id
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

    @Column
    private int slot_id;

}
