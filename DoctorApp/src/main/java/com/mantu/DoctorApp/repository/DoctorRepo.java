package com.mantu.DoctorApp.repository;

import com.mantu.DoctorApp.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctor,Integer> {
}
