package com.example.mysql.services;

import com.example.mysql.dto.TodoDTO;
import com.example.mysql.modells.Todo;
import com.example.mysql.repository.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService{

    private ToDoRepo toDoRepo;

    @Autowired
    public ToDoServiceImpl(ToDoRepo toDoRepo) {
        this.toDoRepo = toDoRepo;
    }

    @Override
    public List<Todo> getAllToDos() {
        return toDoRepo.findAll();
    }

    @Override
    public void saveTodo(Todo todo) {
        toDoRepo.save(todo);
    }

    @Override
    public void delete(long id) {
        toDoRepo.deleteById(id);
    }

    @Override
    public Todo findById(long id) {
        return toDoRepo.findById(id).orElse(null);
    }

    @Override
    public void edit(long id, TodoDTO todoDTO) {
        Todo oldTodo = findById(id);
        oldTodo.update(todoDTO);
        toDoRepo.save(oldTodo);
    }
}
