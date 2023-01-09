package com.hmsapplication.repository;

import com.hmsapplication.entity.Appointment;
import com.hmsapplication.entity.Patient;
import com.hmsapplication.entity.ViewApp;
import com.hmsapplication.entity.ViewAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {


    @Query(value = "select a.id as id,p.pname as pname ,a.visiting_date as visiting_date,a.reason as reason,d.dname as dname,a.status as status FROM appointment a left join patient p on a.patient_id = p.id left join doctor d on a.visiting_doctor_id = d.id",nativeQuery = true)
    List<ViewApp> getAppointments();

    /*

    @Query(
    value = "select p.pname as id,d.dname as dname,s.sname as sname,a.visiting_date as visiting_date
        FROM appointment_dup a
        join patient p
        on p.id = a.patient_id
        join doctor d
        on d.id = a.visiting_doctor_id
        join slots s
        on s.id = a.slot_id", nativeQuery = true)

    */

/*
    @Query(
    value = "select count(*)
    FROM appointment_dup a
    join patient p
    on p.id = a.patient_id
    join doctor d
    on d.id = a.visiting_doctor_id
    join slots s
    on s.id = a.slot_id where visiting_date = ?1 && s.id = ?1 && d.id = ?1", nativeQuery = true)

 */

    Appointment findById(int id);
}
