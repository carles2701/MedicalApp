package com.example.carles2701.MedicalApp.Controller;

import com.example.carles2701.MedicalApp.Repository.PatientRepository;
import com.example.carles2701.MedicalApp.Service.LaboratoryTestService;
import com.example.carles2701.MedicalApp.Service.OrderForTestService;
import com.example.carles2701.MedicalApp.Service.ResearchProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PatientController {

    @Autowired
    LaboratoryTestService laboratoryTestService;

    @Autowired
    OrderForTestService orderForTestService;

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    ResearchProjectService researchProjectService;

}
