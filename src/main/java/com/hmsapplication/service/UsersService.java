package com.hmsapplication.service;

import com.hmsapplication.entity.UsersModel;
import com.hmsapplication.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;


    public List<UsersModel> getUsersModel() {
        return usersRepository.findAll();
    }


    public UsersModel updateuser(UsersModel usersModel) {
        UsersModel uolddata = usersRepository.findByUid(usersModel.getUid());
        uolddata.setUsername(usersModel.getUsername());
        uolddata.setPassword(usersModel.getPassword());
        uolddata.setDisplayname(usersModel.getDisplayname());
        uolddata.setType(usersModel.getType());
        return usersRepository.save(uolddata);
    }
}