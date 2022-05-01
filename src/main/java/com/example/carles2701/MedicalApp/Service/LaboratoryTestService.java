package com.example.carles2701.MedicalApp.Service;

import com.example.carles2701.MedicalApp.Entity.LaboratoryTest;
import com.example.carles2701.MedicalApp.Entity.Patient;
import com.example.carles2701.MedicalApp.Repository.LaboratoryTestRepository;
import com.example.carles2701.MedicalApp.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaboratoryTestService {

    @Autowired
    LaboratoryTestRepository laboratoryTestRepository;

    public List<LaboratoryTest> getAllLaboTests(){
        return laboratoryTestRepository.findAll();
    }

    public void addLaboTest(LaboratoryTest laboratoryTest){
        laboratoryTestRepository.save(laboratoryTest);
    }

    public void removeLaboTestById(int id){
        laboratoryTestRepository.deleteById(id);
    }

    public Optional<LaboratoryTest> getPLaboTestById(int id){
        return laboratoryTestRepository.findById(id);
    }

    public List<Ticket>getAllTicketsByArtistId(int id){
        return ticketsRepository.findAllByArtist_Id(id);
    }

}
