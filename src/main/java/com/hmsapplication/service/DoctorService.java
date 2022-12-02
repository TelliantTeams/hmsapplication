package com.hmsapplication.service;

import com.hmsapplication.entity.DoctorModel;
import com.hmsapplication.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;

    public List<DoctorModel> getDoctorModel() {
        return doctorRepository.findAll();
    }

    public DoctorModel createDoctor(DoctorModel doctorModel) {
        return doctorRepository.save(doctorModel);
    }

    public DoctorModel updateDoctor(DoctorModel doctorModel) {
        DoctorModel dolddata = doctorRepository.findByDuserid(doctorModel.getDuserid());
        dolddata.setDaddress(doctorModel.getDaddress());
        dolddata.setDcontact(doctorModel.getDcontact());
        dolddata.setDmail(doctorModel.getDmail());
        dolddata.setDqualification(doctorModel.getDqualification());
        return doctorRepository.save(dolddata);
    }
}
