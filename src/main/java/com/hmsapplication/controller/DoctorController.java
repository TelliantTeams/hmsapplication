package com.hmsapplication.controller;

import com.hmsapplication.entity.Doctor;
import com.hmsapplication.repository.DoctorRepository;
import com.hmsapplication.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/doctor")
@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private DoctorRepository doctorRepository;


    @GetMapping("/all")
    public List<Doctor> findAllDoctor(){
        return doctorService.getDoctor();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Doctor> getDoctorById (@PathVariable("id") int id) {
        Doctor doctor = doctorRepository.findById(id);
        return new ResponseEntity<>(doctor, HttpStatus.OK);
    }

    @PostMapping("/new")
    public Doctor addDoctor(@RequestBody Doctor doctor){
        return doctorService.createDoctor(doctor);
    }

    @GetMapping("/count")
    public long findDoctorCount() {
        return doctorService.getDoctorCount();
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<Doctor> updateDoctor(@PathVariable(value = "id") int id,
                                              @RequestBody Doctor doctorDetails){
        Doctor doctor = doctorRepository.findById(id);

        doctor.setContact(doctorDetails.getContact());
        doctor.setMail(doctorDetails.getMail());
        doctor.setQualification(doctorDetails.getQualification());
        final Doctor updateddoctor = doctorRepository.save(doctor);
        return ResponseEntity.ok(updateddoctor);
    }




}
