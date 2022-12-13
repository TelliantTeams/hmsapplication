package com.hmsapplication.service;

import com.hmsapplication.entity.Patient;
import com.hmsapplication.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getPatient(){
        return patientRepository.findAll();
    }

    public Patient createPatient(Patient patient){
        return patientRepository.save(patient);
    }

    public Patient registerUser(Patient users) {

        return patientRepository.save(users);
    }

    public long getPatientCount(){
        return patientRepository.findAll().stream().count();
    }

}
