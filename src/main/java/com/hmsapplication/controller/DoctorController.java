package com.hmsapplication.controller;

import com.hmsapplication.entity.DoctorModel;
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
    public List<DoctorModel> findAllDoctorModel(){
        return doctorService.getDoctorModel();
    }

    @PostMapping("/new")
    public DoctorModel addDoctor(@RequestBody DoctorModel doctorModel){
        return doctorService.createDoctor(doctorModel);
    }

    @PutMapping("/update")
    public DoctorModel updateDoctor(@RequestBody DoctorModel doctorModel) {
        return doctorService.updateDoctor(doctorModel);
    }
}
