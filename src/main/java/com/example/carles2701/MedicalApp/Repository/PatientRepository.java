package com.example.carles2701.MedicalApp.Repository;

import com.example.carles2701.MedicalApp.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
