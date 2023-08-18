package com.mantu.DoctorApp.controller;

import com.mantu.DoctorApp.model.Appointment;
import com.mantu.DoctorApp.model.Patient;
import com.mantu.DoctorApp.model.dataToObj.SignInInput;
import com.mantu.DoctorApp.model.dataToObj.SignupOutput;
import com.mantu.DoctorApp.service.AuthenticationService;
import com.mantu.DoctorApp.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
@Validated
@RestController
@RequestMapping("patients")
public class PatientController {
    @Autowired
    PatientService patientService;
    @Autowired
    AuthenticationService authenticationService;
    @PostMapping("/signup")
    public SignupOutput signupPatient(@RequestBody Patient patient) throws NoSuchAlgorithmException {
        return patientService.signupPatient(patient);
    }
    @PostMapping("/signIn")
    public void signInPatient(@RequestBody @Valid SignInInput signInInput) throws NoSuchAlgorithmException, MessagingException {
        patientService.signInPatient(signInInput);
    }
    @DeleteMapping("/signOut")
    public String signOutPatient(String patientEmail, String token){
        if(authenticationService.authenticate(patientEmail,token)){
           return patientService.signOutPatient(patientEmail);
        }else{
            return "sign out not allowed for non authenticated user";
        }
    }
    @GetMapping
    public List<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }
    @PostMapping("appointment/schedule")
    public String scheduleAppointment(@RequestBody Appointment appointment, String email, String token){
        if(authenticationService.authenticate(email,token)) {
           boolean status = patientService.scheduleAppointment(appointment);
            return status ? "appointment schedule" : "error occurred during schedule appointment";
        }else{
            return "scheduling failed because invalid authentication";
        }
    }
    @DeleteMapping("appointment/cancel")
    public String cancelAppointment( String email,String token){
        if(authenticationService.authenticate(email,token)) {
            patientService.cancelAppointment(email);
            return "appointment schedule";
        }else{
            return "scheduling failed because invalid authentication";
        }
    }
}
