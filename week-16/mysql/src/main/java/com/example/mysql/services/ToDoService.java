package com.example.mysql.services;

import com.example.mysql.dto.TodoDTO;
import com.example.mysql.modells.Todo;

import java.util.List;

public interface ToDoService {

    List<Todo> getAllToDos();

    void saveTodo(Todo todo);

    void delete(long id);

    Todo findById(long id);

    void edit(long id, TodoDTO todoDTO);
}
