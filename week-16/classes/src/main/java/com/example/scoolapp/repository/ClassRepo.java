package com.example.scoolapp.repository;

import com.example.scoolapp.modells.Classroom;
import org.springframework.data.repository.CrudRepository;

public interface ClassRepo extends CrudRepository<Classroom, Long> {

}
