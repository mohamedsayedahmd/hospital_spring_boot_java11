package com.hospital.demo.controller;

import com.hospital.demo.model.Patient;
import com.hospital.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired // make the dependency injection design pattern.
    private PatientService patientService; //patientService called bean
    @GetMapping("/print-name") // ↓ ↑   enable postman
    public ResponseEntity printPatientName(@RequestParam String name, @RequestParam("a") Integer age){
        return ResponseEntity.ok(patientService.printName(name,age));
    }
    @GetMapping("/print-all-patients")
    public ResponseEntity getPatients(){
        return ResponseEntity.ok(patientService.getPatients());
    }
    @PostMapping("/save")
    public ResponseEntity savePatient(@RequestBody Patient patient){
        return ResponseEntity.ok(patient);
    }
    public void helloworld() {
    }

}
