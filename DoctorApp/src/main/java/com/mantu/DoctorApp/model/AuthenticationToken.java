package com.mantu.DoctorApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AuthenticationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tokenID;
    private String tokenValue;
    private LocalDateTime tokenCreationTimeStamp;

    //mapping
    @OneToOne
    @JoinColumn(name = "fk_patient_ID")
    Patient patient;
    //create parametrised constructor which takes patient as an argument
    public AuthenticationToken(Patient patient){
        this.patient = patient;
        this.tokenValue = UUID.randomUUID().toString();//give unique string value
        this.tokenCreationTimeStamp = LocalDateTime.now();
    }
}
