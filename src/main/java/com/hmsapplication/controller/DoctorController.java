package com.hmsapplication.controller;

import com.hmsapplication.entity.Doctor;
import com.hmsapplication.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;


    @GetMapping("/all")
    public List<Doctor> findAllDoctor(){
        return doctorService.getDoctor();
    }

    @PostMapping("/new")
    public Doctor addDoctor(@RequestBody Doctor doctor){
        return doctorService.createDoctor(doctor);
    }

    @GetMapping("/count")
    public int findDoctorCount() {
        return doctorService.getDoctorCount();
    }

}
