package com.hospital.demo.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component

public class PatientModel {
    List<Patient> patientNames = new ArrayList<>();

    PatientModel(){
        patientNames.add(new Patient("Amer",28));
        patientNames.add(new Patient("Rami",26));
        patientNames.add(new Patient("Mohamed",23));

    }
    public List<Patient> getPatients(){
        return patientNames;
    }
}
