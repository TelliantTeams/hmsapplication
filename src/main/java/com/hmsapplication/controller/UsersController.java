package com.hmsapplication.controller;

import com.hmsapplication.entity.Users;
import com.hmsapplication.repository.UsersRepository;
import com.hmsapplication.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsersController {


    @Autowired
    private UsersService usersService;

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/all")
    public List<Users> findAllUsers() {
        return usersService.getUsers();
    }

    @PostMapping(path = "/create")
    public Users createuser(@RequestBody Users users){
        return usersService.createUser(users);
    }



}

