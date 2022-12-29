package com.hmsapplication.repository;

import com.hmsapplication.entity.Doctor;
import com.hmsapplication.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

    Patient findById(int id);
}