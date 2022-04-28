package com.example.carles2701.MedicalApp.Service;

import com.example.carles2701.MedicalApp.Entity.Patient;
import com.example.carles2701.MedicalApp.Entity.ResearchProject;
import com.example.carles2701.MedicalApp.Repository.PatientRepository;
import com.example.carles2701.MedicalApp.Repository.ResearchProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResearchProjectService {

    @Autowired
    ResearchProjectRepository researchProjectRepository;

    public List<ResearchProject> getAllResearchProjects(){
        return researchProjectRepository.findAll();
    }

    public void addResearchProject(ResearchProject researchProject){
        researchProjectRepository.save(researchProject);
    }

    public void removeResearchProjectById(int id){
        researchProjectRepository.deleteById(id);
    }

    public Optional<ResearchProject> getResearchProjectById(int id){
        return researchProjectRepository.findById(id);
    }
}
