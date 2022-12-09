package com.hmsapplication.controller;
import com.hmsapplication.entity.Patient;
import com.hmsapplication.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/all")
    public List<Patient> findAllPatient(){
        return patientService.getPatient();
    }

    @PostMapping("/new")
    public Patient addPatient(@RequestBody Patient patient){
        return patientService.createPatient(patient);
    }

    @GetMapping("/count")
    public int findPatientCount(){
        return patientService.getPatientCount();
    }


}

