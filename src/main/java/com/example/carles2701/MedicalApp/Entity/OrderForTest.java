package com.example.carles2701.MedicalApp.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderForTest {

    private int id;
    private String nameOfOrder;
    private String dateOfOrder;
    private LaboratoryTest laboratoryTest;
}
