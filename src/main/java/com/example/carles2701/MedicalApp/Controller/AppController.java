package com.example.carles2701.MedicalApp.Controller;

import com.example.carles2701.MedicalApp.Entity.LaboratoryTest;
import com.example.carles2701.MedicalApp.Entity.OrderForTest;
import com.example.carles2701.MedicalApp.Entity.Patient;
import com.example.carles2701.MedicalApp.Entity.ResearchProject;
import com.example.carles2701.MedicalApp.Repository.PatientRepository;
import com.example.carles2701.MedicalApp.Service.LaboratoryTestService;
import com.example.carles2701.MedicalApp.Service.OrderForTestService;
import com.example.carles2701.MedicalApp.Service.PatientService;
import com.example.carles2701.MedicalApp.Service.ResearchProjectService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class AppController {

    @Autowired
    LaboratoryTestService laboratoryTestService;

    @Autowired
    OrderForTestService orderForTestService;

    @Autowired
    PatientService patientService;

    @Autowired
    ResearchProjectService researchProjectService;

    @GetMapping("/patient/db")
    public String getPatients(Model model){
        model.addAttribute("patients", patientService.getAllPatients());
        return "patientPage";
    }

    @GetMapping("/patient/db/add")
    public String addPatientToDB(Model model){
        model.addAttribute("patient", new Patient());
        return "addPatientPage";
    }

    @PostMapping(value = "/patient/db/add")
    public String postAddPatient(@ModelAttribute("patient") Patient patient){
        patientService.addPatient(patient);
        return "redirect:/patient/db";
    }

    @GetMapping("/patient/db/update/{id}")
    public String updatePatient(@PathVariable int id, Model model){
        Optional<Patient> patient = patientService.getPatientById(id);
        if(patient.isPresent()) {
            model.addAttribute("patient", patient.get());
            return "addPatientPage";
        }
        else
            return "404";
    }

    @GetMapping("/patient/db/delete/{id}")
    public String deletePatient(@PathVariable int id){
        patientService.removePatientById(id);
        return "redirect:/patient/db";
    }

    @GetMapping("/project")
    public String getResearchProjects(Model model){
        model.addAttribute("projects",researchProjectService.getAllResearchProjects());
        return "researchProjectPage";
    }

    @GetMapping("/project/add")
    public String addResearchProject(Model model){
        model.addAttribute("project", new ResearchProject());
        return "addResearchProjectPage";
    }

    @PostMapping(value = "/project/add")
    public String postAddResearchProject(@ModelAttribute("project")ResearchProject researchProject){
        researchProjectService.addResearchProject(researchProject);
        return "redirect:/project";
    }

    @GetMapping("/project/update/{id}")
    public String updateResearchProject(@PathVariable int id, Model model){
        Optional<ResearchProject> researchProject = researchProjectService.getResearchProjectById(id);
        if(researchProject.isPresent()) {
            model.addAttribute("project", researchProject.get());
            return "addResearchProjectPage";
        }
        else
            return "404";
    }

    @GetMapping("/project/delete/{id}")
    public String deleteResearchProject(@PathVariable int id){
        researchProjectService.removeResearchProjectById(id);
        return "redirect:/project";
    }

    @GetMapping("/labo/test")
    public String getLaboTests(Model model){
        model.addAttribute("laboTests", laboratoryTestService.getAllLaboTests());
        return "laboTestPage";
    }

    @GetMapping("/labo/test/add")
    public String addLaboTest(Model model){
        model.addAttribute("laboTest", new LaboratoryTest());
        return "addLaboTestPage";
    }

    @PostMapping(value = "/labo/test/add")
    public String postAddLaboTest(@ModelAttribute("laboTest") LaboratoryTest laboratoryTest){
        laboratoryTestService.addLaboTest(laboratoryTest);
        return "redirect:/labo/test";
    }

    @GetMapping("/labo/test/update/{id}")
    public String updateLaboTest(@PathVariable int id, Model model){
        Optional<LaboratoryTest> laboratoryTest = laboratoryTestService.getPLaboTestById(id);
        if(laboratoryTest.isPresent()) {
            model.addAttribute("laboTest", laboratoryTest.get());
            return "addLaboTestPage";
        }
        else
            return "404";
    }

    @GetMapping("/labo/test/delete/{id}")
    public String deleteLaboTest(@PathVariable int id){
        laboratoryTestService.removeLaboTestById(id);
        return "redirect:/labo/test";
    }

    @GetMapping("/labo/order")
    public String getOrders(Model model){
        model.addAttribute("orders", orderForTestService.getAllTestOrders());
        return "orderForTestPage";
    }

    @GetMapping("/labo/order/add")
    public String addOrder(Model model){
        model.addAttribute("order", new OrderForTest());
        return "addOrderForTestPage";
    }

    @PostMapping(value = "/labo/order/add")
    public String postAddOrder(@ModelAttribute("order") OrderForTest orderForTest){
        orderForTestService.addTestOrder(orderForTest);
        return "redirect:/labo/order";
    }

    @GetMapping("/labo/order/update/{id}")
    public String updateOrder(@PathVariable int id, Model model){
        Optional<OrderForTest> orderForTest = orderForTestService.getTestOrderById(id);
        if(orderForTest.isPresent()) {
            model.addAttribute("order", orderForTest.get());
            return "addOrderForTestPage";
        }
        else
            return "404";
    }

    @GetMapping("/labo/order/delete/{id}")
    public String deleteOrder(@PathVariable int id){
        orderForTestService.removeTestOrderById(id);
        return "redirect:/labo/order";
    }
    
}
