package com.hmsapplication.repository;

import com.hmsapplication.entity.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersModel, Integer> {

}