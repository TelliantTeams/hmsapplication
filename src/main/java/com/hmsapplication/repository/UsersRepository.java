package com.hmsapplication.repository;

import com.hmsapplication.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UsersRepository extends JpaRepository<Users, Integer> {



}