package com.mantu.DoctorApp.repository;

import com.mantu.DoctorApp.model.Appointment;
import com.mantu.DoctorApp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepo extends JpaRepository<Appointment,Integer> {
    Appointment findFirstByPatient(Patient patient);
}
