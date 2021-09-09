package com.example.billing.patient;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Long patientId;

    private Boolean insured;

    private String name;

    private LocalDate dob;

    private Integer age;

    public Patient(){

    }

    public Patient(Long patientId, String name, LocalDate dob, Integer age, Boolean insured){
        this.patientId=patientId;
        this.name=name;
        this.dob=dob;
        this.age=age;
        this.insured=insured;
    }

    public Boolean getInsured() {
        return insured;
    }

    public void setInsured(Boolean insured) {
        this.insured = insured;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", patientId=" + patientId +
                ", insured=" + insured +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }

}
