package com.example.carles2701.MedicalApp.Repository;

import com.example.carles2701.MedicalApp.Entity.LaboratoryTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaboratoryTestRepository extends JpaRepository<LaboratoryTest, Integer> {
    List<LaboratoryTest> findAllByOrder_id(int id);

}
