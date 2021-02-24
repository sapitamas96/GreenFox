package com.example.classes.services;

import com.example.classes.modells.Teacher;
import com.example.classes.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImp implements TeacherService{

    private PersonRepo personRepo;

    @Autowired
    public TeacherServiceImp(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @Override
    public void add(Teacher teacher) {
        personRepo.save(teacher);
    }
}
