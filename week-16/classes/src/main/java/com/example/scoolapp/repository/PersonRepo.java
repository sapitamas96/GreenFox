package com.example.scoolapp.repository;

import com.example.scoolapp.modells.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person, Long> {
}
