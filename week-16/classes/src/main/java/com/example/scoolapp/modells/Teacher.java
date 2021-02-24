package com.example.scoolapp.modells;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Teacher extends Person{

    @OneToMany
    private List<Student> students;
}
