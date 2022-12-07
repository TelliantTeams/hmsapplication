package com.hmsapplication.service;

import com.hmsapplication.entity.LoginDetails;
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


    public int loginUser(LoginDetails details){

        int successLogin=-1;
        Users user=this.usersRepository.findByUser(details.getUsername());
        if(user!=null) {
            if (user.getPassword().equals(details.getPassword())) {
                 successLogin = 1;
            }
        }
         return successLogin;
    }

    public int saveUser(Users user){

        this.usersRepository.save(user);
        this.usersRepository.flush();
        System.out.println(user.getId());
        return user.getId();
    }

}