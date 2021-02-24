package com.example.classes.modells;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student extends Person{

    @ManyToOne
    private Teacher teacher;

    public Student() {}

    public Student(Long id, String name, Integer age, Classroom myClassroom, Teacher teacher) {
        super(id, name, age, myClassroom);
        this.teacher = teacher;
    }

    public Student(Teacher teacher) {
        this.teacher = teacher;
    }
}
