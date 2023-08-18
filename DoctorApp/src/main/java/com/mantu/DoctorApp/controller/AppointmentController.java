package com.mantu.DoctorApp.controller;

import com.mantu.DoctorApp.model.Appointment;
import com.mantu.DoctorApp.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("appointment")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;
    @GetMapping
    public List<Appointment>getAllAppointments(){
        return appointmentService.getAllAppointments();
    }
}
