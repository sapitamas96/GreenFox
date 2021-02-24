package com.example.classes.modells;

import javax.persistence.*;
import java.util.List;

@Entity
public class Classroom {

    @Id
    @GeneratedValue
    private Long id;
    private String className;
    @OneToMany(mappedBy = "teacher")
    private List<Student> students;
    @OneToOne
    private Teacher teacher;
}
