package com.mantu.DoctorApp.service;

import com.mantu.DoctorApp.model.Doctor;
import com.mantu.DoctorApp.repository.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepo doctorRepo;

    public String addDoctor(Doctor doctor) {
        if(doctor != null){
            doctorRepo.save(doctor);
            return "doctor is added";
        }
        return "Not added";
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepo.findAll();
    }
}
