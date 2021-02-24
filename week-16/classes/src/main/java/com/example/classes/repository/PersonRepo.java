package com.example.classes.repository;

import com.example.classes.modells.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person, Long> {
}
