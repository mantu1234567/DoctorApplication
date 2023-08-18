package com.mantu.DoctorApp.repository;

import com.mantu.DoctorApp.model.AuthenticationToken;
import com.mantu.DoctorApp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticationTokenRepo extends JpaRepository<AuthenticationToken,Integer> {
    AuthenticationToken findFirstByTokenValue(String authenticateToken);

    AuthenticationToken findFirstByPatient(Patient patient);
}
