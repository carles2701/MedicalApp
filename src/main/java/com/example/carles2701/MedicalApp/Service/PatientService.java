package com.example.carles2701.MedicalApp.Service;

import com.example.carles2701.MedicalApp.Entity.Patient;
import com.example.carles2701.MedicalApp.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    public void addPatient(Patient patient){
        patientRepository.save(patient);
    }

    public void removePatientById(int id){
        patientRepository.deleteById(id);
    }

    public Optional<Patient> getPatientById(int id){
        return patientRepository.findById(id);
    }

    public List<Ticket>getAllTicketsByArtistId(int id){
        return ticketsRepository.findAllByArtist_Id(id);
    }

    public List<Ticket>getAllTicketsByArtistId(int id){
        return ticketsRepository.findAllByArtist_Id(id);
    }


}
