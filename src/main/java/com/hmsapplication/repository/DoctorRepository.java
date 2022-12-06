package com.hmsapplication.repository;

import com.hmsapplication.entity.DoctorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorModel, Integer> {

}