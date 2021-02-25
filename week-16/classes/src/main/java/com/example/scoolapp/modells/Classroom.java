package com.example.scoolapp.modells;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Classroom {

    @Id
    @GeneratedValue
    private Long id;
    private String className;
    @OneToMany
    private List<Person> members;

}
