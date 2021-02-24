package com.example.classes.services;

import com.example.classes.repository.ClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassroomServiceImp implements ClassroomService{

    private ClassRepo classRepo;

    @Autowired
    public ClassroomServiceImp(ClassRepo classRepo) {
        this.classRepo = classRepo;
    }
}
