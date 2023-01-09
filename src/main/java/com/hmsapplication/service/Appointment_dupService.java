package com.hmsapplication.service;

import com.hmsapplication.entity.Appointment_dup;
import com.hmsapplication.entity.ViewAppdup;
import com.hmsapplication.entity.ViewAvail;
import com.hmsapplication.repository.Appointment_dupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class Appointment_dupService {

    @Autowired
    Appointment_dupRepository appointment_dupRepository;
    public List<Appointment_dup> getAppointmentDup() {
        return appointment_dupRepository.findAll();
    }

    public List<ViewAppdup> getAppointmentDups(){
        return appointment_dupRepository.getAppointmentDups();
    }

//    public List<ViewAvail> getAppointmentAvail(){
//        return appointment_dupRepository.getAppointmentAvail();
//    }

//    public int getCounts(@Param("visiting_date") LocalDate visiting_date, @Param("id") int sid, @Param("id") int id){
//        return appointment_dupRepository.getCount(visiting_date,sid,id);
//    }

//    public int getCounts(@RequestParam int slot_id, @RequestParam int visiting_doctor_id){
//        return appointment_dupRepository.getCount(slot_id, visiting_doctor_id);
//    }
}
