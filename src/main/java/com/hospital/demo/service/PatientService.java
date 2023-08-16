package com.hospital.demo.service;

import com.hospital.demo.model.Patient;
import com.hospital.demo.model.PatientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientModel patientModel;

    public Patient printName(String name, Integer age){
        return patientModel.getPatients()
                .stream()
                .filter(i->{
                    return i.getName().equals(name) || i.getAge().equals(age);
                })
                .findAny()
                .orElse(new Patient());
        // in order to display that as JSON
    }// here I got the name from the DB
    public List<Patient> getPatients(){

        return this.patientModel.getPatients();
    }
}
