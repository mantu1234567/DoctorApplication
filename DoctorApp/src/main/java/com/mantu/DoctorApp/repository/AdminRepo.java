package com.mantu.DoctorApp.repository;

import com.mantu.DoctorApp.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,Integer> {
}
