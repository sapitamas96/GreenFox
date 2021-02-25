package com.example.scoolapp.services;

import com.example.scoolapp.dto.PersonCreationDTO;
import com.example.scoolapp.factory.PersonFactory;
import com.example.scoolapp.modells.Person;
import com.example.scoolapp.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepo personRepo;

    @Autowired
    public PersonServiceImpl(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @Override
    public Person addPerson(PersonCreationDTO person) {
        Person newPerson = new PersonFactory().createPerson(person);
        return personRepo.save(newPerson);
    }

    @Override
    public Person getPersonById(Long id) {
        return personRepo.findById(id).orElse(null);
    }

    @Override
    public List<Person> getListOfPersons() {
        return personRepo.findAll();
    }
}
