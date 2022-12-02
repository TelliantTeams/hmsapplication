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


    @PostMapping("/new")
    public UsersModel createuser(@RequestParam("username") String username, @RequestParam("password") String password) {
        UsersModel newuser = new UsersModel();
        newuser.setUid(generateRandomChars(
                "ABCDEFGH123456789", 5));
        newuser.setUsername(username);
        newuser.setPassword((password));
        newuser.setDisplayname("temp");
        newuser.setType("temp");
        newuser.setActive(true);


        return usersRepository.save(newuser);
    }


    @PutMapping("/update")
    public UsersModel updateuser(@RequestBody UsersModel usersModel) {
        return usersService.updateuser(usersModel);
    }

    public static String generateRandomChars(String candidateChars, int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(candidateChars.charAt(random.nextInt(candidateChars
                    .length())));
        }

        return sb.toString();
    }
}

