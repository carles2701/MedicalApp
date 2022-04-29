package com.example.carles2701.MedicalApp.Repository;

import com.example.carles2701.MedicalApp.Entity.LaboratoryTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboratoryTestRepository extends JpaRepository<LaboratoryTest, Integer> {

}
