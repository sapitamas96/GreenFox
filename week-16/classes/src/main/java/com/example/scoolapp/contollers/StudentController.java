package com.example.scoolapp.contollers;

import com.example.scoolapp.dto.PersonCreationDTO;
import com.example.scoolapp.modells.Student;
import com.example.scoolapp.services.PersonService;
import com.example.scoolapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    private PersonService personService;

    @Autowired
    public StudentController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/add")
    public String addStudent() {
        return "addStudent";
    }

    @PostMapping("/add")
    public String addStudentPost(@ModelAttribute PersonCreationDTO dto) {
        personService.addPerson(dto);
        return "redirect:/index";
    }
}
