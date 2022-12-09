package com.hmsapplication.service;

import com.hmsapplication.entity.Appointment;
import com.hmsapplication.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    public List<Appointment> getAppointment() { return appointmentRepository.findAll();}

    public Appointment createAppointment(Appointment appointment){
        return appointmentRepository.save(appointment);
    }
}
