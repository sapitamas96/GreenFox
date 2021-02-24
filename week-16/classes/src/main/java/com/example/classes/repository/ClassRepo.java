package com.example.classes.repository;

import com.example.classes.modells.Classroom;
import org.springframework.data.repository.CrudRepository;

public interface ClassRepo extends CrudRepository<Classroom, Long> {

}
