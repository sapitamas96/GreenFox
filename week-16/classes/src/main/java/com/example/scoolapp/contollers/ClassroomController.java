package com.example.scoolapp.contollers;

import com.example.scoolapp.modells.Classroom;
import com.example.scoolapp.modells.Student;
import com.example.scoolapp.services.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/classroom")
public class ClassroomController {

    private ClassroomService classroomService;

    @Autowired
    public ClassroomController(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @GetMapping("/add")
    public String addStudent() {
        return "addClassroom";
    }

    @PostMapping("/add")
    public String addStudentPost(@ModelAttribute Classroom classroom) {
       // classroomService.add(classroom);
        return "redirect:/index";
    }
}
