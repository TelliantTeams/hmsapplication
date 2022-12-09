package com.hmsapplication.service;

import com.hmsapplication.entity.Doctor;
import com.hmsapplication.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;

    public List<Doctor> getDoctor() {
        return doctorRepository.findAll();
    }

    public Doctor createDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public int getDoctorCount() {
        return doctorRepository.findAll().size();
    }


}
