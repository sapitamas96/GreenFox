package com.example.scoolapp.repository;

import com.example.scoolapp.modells.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepo extends CrudRepository<Person, Long> {

    List<Person> findAll();
}
