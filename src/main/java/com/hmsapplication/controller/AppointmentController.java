package com.hmsapplication.controller;

import com.hmsapplication.entity.Appointment;
import com.hmsapplication.entity.Doctor;
import com.hmsapplication.entity.ViewApp;
import com.hmsapplication.entity.ViewAppointment;
import com.hmsapplication.repository.AppointmentRepository;
import com.hmsapplication.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/appointment")
@CrossOrigin(origins = "http://localhost:4200")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private AppointmentRepository appointmentRepository;


    @GetMapping("/all")
    public List<Appointment> findAllAppointment(){
        return appointmentService.getAppointment();
    }

    @PostMapping("/new")
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        appointment.setStatus("pending");
        appointment.setApproved_id(1);
     //   appointment.setVisiting_date(LocalDate.now());
        System.out.println(appointment);
        return appointmentService.createAppointment(appointment);

    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Appointment> getAppointmentById (@PathVariable("id") int id) {
        Appointment appointment = appointmentRepository.findById(id);
        return new ResponseEntity<>(appointment, HttpStatus.OK);
    }

    @PostMapping("/approveapp/{id}")
    public Appointment approveApp(@PathVariable(value = "id") int id){
        Appointment appointment = appointmentRepository.findById(id);

        appointment.setStatus("approved");
        System.out.println("status approved");
        final Appointment approvedapp = appointmentRepository.save(appointment);
        return null;
    }

    @PostMapping("/rejectapp/{id}")
    public Appointment rejectApp(@PathVariable(value = "id") int id){
        Appointment appointment = appointmentRepository.findById(id);

        appointment.setStatus("rejected");
        System.out.println("status rejected");
        final Appointment rejectapp = appointmentRepository.save(appointment);
        return null;
    }

    @PostMapping("/reschedule/{id}")
    public ResponseEntity<Appointment> reschedule(@PathVariable(value = "id") int id,
                                                  @RequestBody Appointment rescheduleapp){
        Appointment appointment = appointmentRepository.findById(id);

        appointment.setVisiting_date(rescheduleapp.getVisiting_date());
        System.out.println(appointment);
        final Appointment rscheduled = appointmentRepository.save(appointment);
        System.out.println(rscheduled);
        return ResponseEntity.ok(rscheduled);

    }

    @GetMapping("/todayapp")
    public List<ViewApp> findtodayapp(){
        return appointmentService.getTodayAppointment();
    }

    @GetMapping("/pendingapp")
    public List<ViewApp> findpendingapp(){
        return appointmentService.getPendingAppointment();
    }

    @GetMapping("/reqapp")
    public List<ViewApp> findreqapp(){
        return appointmentRepository.getAppointments();
    }

    @GetMapping("/approvedapp")
    public List<ViewApp> findapprovedapp() {return appointmentService.getApprovedAppointment();}

}
