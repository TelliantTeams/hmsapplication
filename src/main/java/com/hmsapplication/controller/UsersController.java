package com.hmsapplication.controller;

import com.hmsapplication.entity.UsersModel;
import com.hmsapplication.repository.UsersRepository;
import com.hmsapplication.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/user")
public class UsersController {


    @Autowired
    private UsersService usersService;

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/all")
    public List<UsersModel> findAllUsersModel() {
        return usersService.getUsersModel();
    }

    @PostMapping(path = "/create")
    public UsersModel createuser(@RequestBody UsersModel usersModel){
        return usersService.createUser(usersModel);
    }



}

