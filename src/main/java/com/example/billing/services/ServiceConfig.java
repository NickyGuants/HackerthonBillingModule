package com.example.billing.services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ServiceConfig {
    @Bean
    CommandLineRunner servicecommandLineRunner(
        ServiceRepository repository){
        return args -> {
            Service Reg= new Service(
                    "Registration"
            );

            Service pham= new Service(
                    "Pharmacy"
            );
            Service special= new Service(
                    "Special Clinic"
            );
            Service OPD= new Service(
                    "OPD"
            );
            Service lab= new Service(
                    "Lab Fees"
            );
            Service drug= new Service(
                    "Drugs"
            );

            repository.saveAll(List.of(Reg, pham, special, OPD, lab, drug));
        };
    }
}
