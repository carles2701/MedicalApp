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
public class Patient {

    private int id;
    private String name;
    private String surname;
    private String dateOfBirth;

    public String nameAndSurname(){
        return name + " " + surname;
    }
}
