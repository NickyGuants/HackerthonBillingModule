package com.example.billing.patient;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    List<Patient>getAllPatients(){
        return patientRepository.findAll();
    }

    void addPatient(Patient patient) {
        patientRepository.save(patient);
    }
}
