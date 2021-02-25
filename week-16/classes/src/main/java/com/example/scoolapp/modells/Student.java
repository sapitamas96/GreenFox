package com.example.scoolapp.modells;

import com.example.scoolapp.dto.PersonCreationDTO;
import org.hibernate.annotations.Proxy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Student")
@Proxy(lazy = false)
public class Student extends Person{

    public Student() {}

    public Student(PersonCreationDTO dto) {
        super(dto.getName(), dto.getAge(), Role.valueOf(dto.getRole().toUpperCase()));
    }
}
