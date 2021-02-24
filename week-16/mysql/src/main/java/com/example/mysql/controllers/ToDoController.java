package com.example.mysql.controllers;


import com.example.mysql.dto.TodoDTO;
import com.example.mysql.modells.Todo;
import com.example.mysql.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    private ToDoService toDoService;

    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("todos", toDoService.getAllToDos());
        return "todo";
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("todos", toDoService.getAllToDos());
        return "index";
    }

    @GetMapping("/add")
    public String addToDo() {
        return "addTodo";
    }

    @PostMapping("/add")
    public String addTodoPost(@ModelAttribute Todo todo) {
        toDoService.saveTodo(todo);
        return "redirect:/todo/";
    }

    @RequestMapping(value = "/delete/{id}", method = {RequestMethod.DELETE, RequestMethod.POST})
    public String delete(@PathVariable long id) {
        toDoService.delete(id);
        return "redirect:/todo/";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("todo", toDoService.findById(id));
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String editPost(@PathVariable Long id, @ModelAttribute(value = "todo") TodoDTO todoDTO) {
        toDoService.edit(id, todoDTO);
        return "redirect:/todo/";
    }
}
