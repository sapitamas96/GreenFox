package com.example.scoolapp.factory;

import com.example.scoolapp.dto.PersonCreationDTO;
import com.example.scoolapp.modells.Person;
import com.example.scoolapp.modells.Role;
import com.example.scoolapp.modells.Student;
import com.example.scoolapp.modells.Teacher;

public class PersonFactory {

    public Person createPerson(PersonCreationDTO personDTO) {
        Role role = Role.valueOf(personDTO.getRole().toUpperCase());

        switch (role) {
            case STUDENT:
                return new Student(personDTO);
            case TEACHER:
                return new Teacher(personDTO);
            default:
                return null;
        }
    }
}
