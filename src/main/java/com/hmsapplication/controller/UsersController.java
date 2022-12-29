package com.hmsapplication.controller;

import com.hmsapplication.entity.*;
import com.hmsapplication.repository.PatientRepository;
import com.hmsapplication.repository.UsersRepository;
import com.hmsapplication.service.DoctorService;
import com.hmsapplication.service.PatientService;
import com.hmsapplication.service.UsersService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UsersController {


    @Autowired
    private UsersService usersService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private PatientRepository patientaepo;

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/")
    public List<Users> findAllUsers() {
        return usersService.getUsers();
    }

    @PostMapping(path = "/register")
    public ResponseEntity<Users> createuser(@RequestBody Register registerUser){
        System.out.println("User request received "+registerUser);

        Users usr=new Users();

        usr.setUsername(registerUser.getUsername());
        usr.setPassword(registerUser.getPassword());
        usr.setActive(true);
        usr.setType("2");
        usr.setDisplayname(registerUser.getUsername().toUpperCase());

        Users user=usersService.saveUser(usr);
        Patient patient=new Patient();

        patient.setPname(registerUser.getUsername());
        patient.setPdob(registerUser.getDob());
        patient.setPcontact(registerUser.getContact());
        patient.setPaddress(registerUser.getAddress());
        patient.setPgender(registerUser.getGender());
        patient.setPage(registerUser.getAge());
        patient.setPbp(registerUser.getBp());
        patient.setPheight(registerUser.getHeight());
        patient.setPweight(registerUser.getWeight());
        patient.setUser_id(user.getId());


        Patient response= patientService.registerUser(patient);
        return new ResponseEntity<Users>(user,HttpStatus.OK);
    }

    @PostMapping(path= "/registerdoctor")
    public ResponseEntity<Users> createdoctor(@RequestBody Registerdoc registerdoc){
        System.out.println("Doctor request received "+registerdoc);
        Users doc = new Users();

        doc.setUsername(registerdoc.getUsername());
        doc.setPassword(registerdoc.getPassword());
        doc.setActive(true);
        doc.setType("1");
        doc.setDisplayname(registerdoc.getUsername().toUpperCase());

        Users user = usersService.saveUser(doc);

        Doctor doctor = new Doctor();
        doctor.setDname(registerdoc.getUsername());
        doctor.setAge(registerdoc.getAge());
        doctor.setContact(registerdoc.getContact());
        doctor.setAddress(registerdoc.getAddress());
        doctor.setMail(registerdoc.getMail());
        doctor.setQualification(registerdoc.getQualification());
        doctor.setSignature(registerdoc.getUsername());
        doctor.setUser_id(user.getId());

        Doctor response = doctorService.registerdoc(doctor);
        return new ResponseEntity<Users>(user,HttpStatus.OK);
    }



    @PostMapping(path = "/login")
    public ResponseEntity<Users> createuser(@RequestBody LoginDetails loginDetails){

        Users loginStatus= this.usersService.loginUser(loginDetails);
          return new ResponseEntity<>(loginStatus,HttpStatus.OK);

    }

}

