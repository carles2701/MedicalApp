package com.example.carles2701.MedicalApp.Repository;

import com.example.carles2701.MedicalApp.Entity.ResearchProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResearchProjectRepository extends JpaRepository<ResearchProject, Integer> {

}
