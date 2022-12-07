package com.hmsapplication.service;

import com.hmsapplication.entity.Patient;
import com.hmsapplication.entity.Users;
import com.hmsapplication.repository.PatientRepository;
import com.hmsapplication.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PatientRepository patientRepo;


    public List<Users> getUsers() {
        return usersRepository.findAll();
    }



}