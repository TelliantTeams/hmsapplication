package com.hmsapplication.service;

import com.hmsapplication.entity.Appointment;
import com.hmsapplication.entity.ViewApp;
import com.hmsapplication.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;



    public List<Appointment> getAppointment() { return appointmentRepository.findAll();}

    public Appointment createAppointment(Appointment appointment){
        return appointmentRepository.save(appointment);
    }

    public List<ViewApp> getTodayAppointment() {
         System.out.println(LocalDate.now());
         var app= appointmentRepository.getAppointments();
         var todayapp= app.stream().filter(a->a.getVisiting_date().equals(LocalDate.now()))
                 .filter(a->a.getStatus().equalsIgnoreCase("approved")).collect(Collectors.toList());
         return todayapp;
    }

    public List<ViewApp> getPendingAppointment() {
        System.out.println(LocalDate.now());
        var app= appointmentRepository.getAppointments();

        var todayapp= app.stream().filter(a->a.getVisiting_date().isAfter(LocalDate.now()))
                .filter(a->a.getStatus().equalsIgnoreCase("pending")).collect(Collectors.toList());
        return todayapp;

    }


    public List<ViewApp> getApprovedAppointment() {
        var app = appointmentRepository.getAppointments();
        var approvedapp = app.stream().filter(a->a.getVisiting_date().isAfter(LocalDate.now()))
                .filter(a->a.getStatus().equalsIgnoreCase("approved")).collect(Collectors.toList());
        return approvedapp;
    }
}
