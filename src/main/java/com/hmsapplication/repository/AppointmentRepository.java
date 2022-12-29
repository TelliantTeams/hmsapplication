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

    Appointment findById(int id);
}
