package com.example.mysql.repository;

import com.example.mysql.modells.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToDoRepo extends CrudRepository<Todo, Long> {

    List<Todo> findAll();
}
