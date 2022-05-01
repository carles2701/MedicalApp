package com.example.carles2701.MedicalApp.Repository;

import com.example.carles2701.MedicalApp.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
    List<Patient> findAllBYLaboTest_id(int id);
    List<Patient> findAllByProject_id(int id);

}
