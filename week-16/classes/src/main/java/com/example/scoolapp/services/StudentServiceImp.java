package com.example.scoolapp.services;

import com.example.scoolapp.modells.Student;
import com.example.scoolapp.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {

    private PersonRepo personRepo;

    @Autowired
    public StudentServiceImp(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @Override
    public void add(Student student) {
        personRepo.save(student);
    }
}
