package com.example.carles2701.MedicalApp.Service;

import com.example.carles2701.MedicalApp.Entity.OrderForTest;
import com.example.carles2701.MedicalApp.Entity.Patient;
import com.example.carles2701.MedicalApp.Repository.OrderForTestRepository;
import com.example.carles2701.MedicalApp.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderForTestService {

    @Autowired
    OrderForTestRepository orderForTestRepository;

    public List<OrderForTest> getAllTestOrders(){
        return orderForTestRepository.findAll();
    }

    public void addTestOrder(OrderForTest orderForTest){
        orderForTestRepository.save(orderForTest);
    }

    public void removeTestOrderById(int id){
        orderForTestRepository.deleteById(id);
    }

    public Optional<OrderForTest> getTestOrderById(int id){
        return orderForTestRepository.findById(id);
    }
}
