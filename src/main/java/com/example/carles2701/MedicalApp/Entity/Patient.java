package com.example.carles2701.MedicalApp.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "laboTest_id", referencedColumnName = "laboTest_id")
    @JoinColumn(name = "project_id", referencedColumnName = "project_id")
    private int id;
    private String name;
    private String surname;
    private String dateOfBirth;

    public String nameAndSurname(){
        return name + " " + surname;
    }
}
