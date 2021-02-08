package com.example.greenfox_class_app.controllers;

import com.example.greenfox_class_app.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

    StudentService studentService;

    public AppController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/gfa")
    public String index(Model model) {
        model.addAttribute("count", studentService.count());
        return "index";
    }

    @GetMapping("/gfa/list")
    public String getStudentsList(Model model) {
        model.addAttribute("studentList", studentService.findAll());
        return "studentList";
    }

    @GetMapping("/gfa/add")
    public String getAdd() {
        return "add";
    }

    @PostMapping("/gfa/save")
    public String saveStudent(String text) {
        studentService.save(text);
        return "add";
    }

    @GetMapping("/gfa/check")
    public String getCheckStudent() {
        return "check";
    }

    @PostMapping("/gfa/check/post")
    public String check(String name, Model model) {
        model.addAttribute("hasStudent", studentService.hasStudent(name));
        model.addAttribute("student", name);
        return "check";
    }
}
