package com.mantu.DoctorApp.model.dataToObj;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SignupOutput {
    private Boolean signupStatus;
    private String signupStatusMessage;
}
