package com.hmsapplication.controller;

import com.hmsapplication.entity.Appointment;
import com.hmsapplication.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;


    @GetMapping("/all")
    public List<Appointment> findAllAppointment(){
        return appointmentService.getAppointment();
    }

    @PostMapping("/new")
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        appointment.setStatus("pending");
     //   appointment.setVisiting_date(LocalDate.now());
        System.out.println(appointment);
        return appointmentService.createAppointment(appointment);

    }

    @GetMapping("/todayapp")
    public List<Appointment> findtodayapp(){
        return appointmentService.getTodayAppointment();
    }

    @GetMapping("/pendingapp")
    public List<Appointment> findpendingapp(){
        return appointmentService.getPendingAppointment();
    }

}
