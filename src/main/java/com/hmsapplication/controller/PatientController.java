package com.hmsapplication.controller;
import com.hmsapplication.entity.PatientModel;
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
    public List<PatientModel> findAllPatientModel(){
        return patientService.getPatientModel();
    }

    @PostMapping("/new")
    public PatientModel addPatient(@RequestBody PatientModel patientModel){
        return patientService.createPatient(patientModel);
    }





}

