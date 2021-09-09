package com.example.billing.patient;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping()
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patients")
    public List<Patient>getAllPatients(){
        return patientService.getAllPatients();
    }


    @PostMapping("/addPatient")
    public void addPatient(@Valid @RequestBody Patient patient){
        patientService.addPatient(patient);

    }
}
