package com.example.scoolapp.services;

import com.example.scoolapp.dto.PersonCreationDTO;
import com.example.scoolapp.modells.Person;

import java.util.List;

public interface PersonService {

    Person addPerson(PersonCreationDTO person);

    Person getPersonById(Long id);

    List<Person> getListOfPersons();
}
