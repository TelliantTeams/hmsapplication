package com.hmsapplication.controller;

import com.hmsapplication.entity.LoginDetails;
import com.hmsapplication.entity.Patient;
import com.hmsapplication.entity.Register;
import com.hmsapplication.entity.Users;
import com.hmsapplication.repository.PatientRepository;
import com.hmsapplication.repository.UsersRepository;
import com.hmsapplication.service.PatientService;
import com.hmsapplication.service.UsersService;
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
    private PatientRepository patientaepo;

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/")
    public List<Users> findAllUsers() {
        return usersService.getUsers();
    }

    @PostMapping(path = "/register")
    public ResponseEntity<Patient> createuser(@RequestBody Register registerUser){
        System.out.println("User request received "+registerUser);

        Users usr=new Users();

        usr.setUsername(registerUser.getUsername());
        usr.setPassword(registerUser.getPassword());
        usr.setActive(true);
        usr.setDisplayname(registerUser.getUsername().toUpperCase());

        int userId=usersService.saveUser(usr);
        Patient patient=new Patient();

        patient.setPname(registerUser.getUsername());
        patient.setPdob(registerUser.getDob());
        patient.setPcontact(registerUser.getContact());
        patient.setUser_id(userId);

        Patient response= patientService.registerUser(patient);
        return new ResponseEntity<Patient>(response,HttpStatus.OK);
    }

    @PostMapping(path = "/login")
    public int createuser(@RequestBody LoginDetails loginDetails){

           int loginStatus= this.usersService.loginUser(loginDetails);
          return loginStatus;

    }

}

