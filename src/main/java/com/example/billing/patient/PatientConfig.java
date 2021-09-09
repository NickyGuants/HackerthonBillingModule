package com.example.billing.patient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class PatientConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            PatientRepository repository){
        return args -> {
            Patient Nick =new Patient(
                    100L,
                    "Nicholas Garvin",
                    LocalDate.of(2000, Month.JANUARY, 20),
                    21,
                    true

            );
            Patient Guants= new Patient(
                    203L,
                    "Mutembei Guantai",
                    LocalDate.of(1950, Month.JANUARY, 20),
                    11,
                    false
            );
            Patient Kelly= new Patient(
                    204L,
                    "Kelly Njagi",
                    LocalDate.of(1919, Month.JANUARY, 20),
                    11,
                    true
            );
            Patient Ken= new Patient(
                    205L,
                    "Ken Wangui",
                    LocalDate.of(1967, Month.JANUARY, 20),
                    11,
                    false
            );
            Patient John= new Patient(
                    206L,
                    "John Doe",
                    LocalDate.of(1987, Month.JANUARY, 20),
                    11,
                    true
            );
            Patient Jane= new Patient(
                    207L,
                    "Jane Doe",
                    LocalDate.of(1978, Month.JANUARY, 20),
                    11,
                    false
            );
            Patient Smith= new Patient(
                    208L,
                    "Smith John",
                    LocalDate.of(1978, Month.JANUARY, 20),
                    11,
                    true
            );
            Patient Joyce= new Patient(
                    209L,
                    "Joyce Waheni",
                    LocalDate.of(2006, Month.JANUARY, 20),
                    11,
                    false
            );
            Patient Lydia= new Patient(
                    210L,
                    "Lydia Waithera",
                    LocalDate.of(1998, Month.JANUARY, 20),
                    11,
                    true
            );

            repository.saveAll(
                    List.of(Nick, Guants, Lydia, John, Joyce, Jane, Smith, Ken, Kelly)
            );
        };
    }
}
