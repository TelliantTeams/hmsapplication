package com.hmsapplication.controller;

import com.hmsapplication.entity.Patient;
import com.hmsapplication.repository.PatientRepository;
import com.hmsapplication.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/patient")
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/all")
    public List<Patient> findAllPatient(){
        return patientService.getPatient();
    }

    @PostMapping("/new")
    public Patient addPatient(@RequestBody Patient patient){
        return patientService.createPatient(patient);
    }

    @GetMapping("/count")
    public long findPatientCount(){
        return patientService.getPatientCount();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Patient> getPatientById (@PathVariable("id") int id) {
        Patient patient = patientRepository.findById(id);
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable(value = "id") int id,
                                                 @RequestBody Patient patientDetails){
        Patient patient = patientRepository.findById(id);

        patient.setPcontact(patientDetails.getPcontact());
        patient.setPaddress(patientDetails.getPaddress());
        patient.setPweight(patientDetails.getPweight());
        patient.setPheight(patientDetails.getPheight());
        patient.setPbp(patientDetails.getPbp());
        final Patient updatedpatient = patientRepository.save(patient);
        System.out.println(updatedpatient);
        return ResponseEntity.ok(updatedpatient);

    }

}

