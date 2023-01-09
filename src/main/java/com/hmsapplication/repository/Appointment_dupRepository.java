package com.hmsapplication.repository;

import com.hmsapplication.entity.Appointment_dup;
import com.hmsapplication.entity.ViewAppdup;
import com.hmsapplication.entity.ViewAvail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Repository
public interface Appointment_dupRepository extends JpaRepository<Appointment_dup, Integer> {


    @Query(value = "select p.pname as pname,d.dname as dname,s.sname as sname,a.visiting_date as visiting_date FROM appointment_dup a join patient p on p.id = a.patient_id join doctor d on d.id = a.visiting_doctor_id join slots s on s.id = a.slot_id", nativeQuery = true)
    List<ViewAppdup> getAppointmentDups();


    @Query(value = "select count(*) FROM appointment_dup a where slot_id = ?1 && visiting_doctor_id = ?1", nativeQuery = true)
    int getCount(@RequestParam int slot_id, @RequestParam int visiting_doctor_id);


}
