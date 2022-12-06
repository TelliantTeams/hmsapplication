package com.hmsapplication.service;

import com.hmsapplication.entity.PatientModel;
import com.hmsapplication.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<PatientModel> getPatientModel(){
        return patientRepository.findAll();
    }

    public PatientModel createPatient(PatientModel patientModel){
        return patientRepository.save(patientModel);
    }



}
