package com.hmsapplication.repository;

import com.hmsapplication.entity.PatientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientModel, Integer> {


}