package com.hmsapplication.repository;

import com.hmsapplication.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

    Doctor findById(int id);
}