package com.hmsapplication.controller;

import com.hmsapplication.entity.Appointment_dup;
import com.hmsapplication.entity.ViewAppdup;
import com.hmsapplication.entity.ViewAvail;
import com.hmsapplication.repository.Appointment_dupRepository;
import com.hmsapplication.service.Appointment_dupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/appointmentdup")
@CrossOrigin(origins = "http://localhost:4200")
public class Appointment_dupController {

    @Autowired
    private Appointment_dupService appointment_dupService;

    @Autowired
    private Appointment_dupRepository appointment_dupRepository;

    @GetMapping("/all")
    public List<Appointment_dup> findAllAppointment(){
        return appointment_dupService.getAppointmentDup();
    }

    @GetMapping("alll")
    public List<ViewAppdup> findslotApp(){
        return appointment_dupService.getAppointmentDups();
    }



//    @GetMapping("count")
//    public int getCounts(@Param("visiting_date") LocalDate visiting_date, @Param("id") int sid, @Param("id") int id){
//        return appointment_dupService.getCounts(visiting_date,sid,id);
//    }

//    @GetMapping("count")
//    public int getCounts(@RequestParam LocalDate visiting_date,@RequestParam int slot_id,@RequestParam int visiting_doctor_id){
//        return appointment_dupService.getCounts(visiting_date, slot_id, visiting_doctor_id);
//    }

//    @GetMapping("count")
//    public long getCounts(@RequestParam int slot_id, @RequestParam int visiting_doctor_id,
//                          @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate visiting_date){
//        var vd=appointment_dupService.getAppointmentDup();
//        long result=vd.stream().filter(a->a.getSlot_id() == slot_id)
//        .filter(a->a.getVisiting_doctor_id()== visiting_doctor_id)
//                .filter(a->a.getVisiting_date().equals(visiting_date)).count();
//
//        return result;
//    }

    @GetMapping("count")
    public long getCounts(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate visiting_date,
                          int slot_id,int visiting_doctor_id){
        var vd=appointment_dupService.getAppointmentDup();
        long result=vd.stream().filter(a->a.getSlot_id() == slot_id)
                .filter(a->a.getVisiting_doctor_id()== visiting_doctor_id)
                .filter(a->a.getVisiting_date().equals(visiting_date)).count();

        return result;
    }

}
