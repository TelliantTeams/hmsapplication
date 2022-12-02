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


    public PatientModel updatePatient(PatientModel patientModel) {
        PatientModel olddata = patientRepository.findByPuserid(patientModel.getPuserid());
        olddata.setPaddress(patientModel.getPaddress());
        olddata.setPcontact(patientModel.getPcontact());
        olddata.setPweight(patientModel.getPweight());
        olddata.setPheight(patientModel.getPheight());
        return patientRepository.save(olddata);
    }
}
