package com.example.scoolapp.contollers;

import com.example.scoolapp.dto.PersonCreationDTO;
import com.example.scoolapp.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    private PersonService personService;

    @Autowired
    public TeacherController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/add")
    public String addTeacher() {
        return "addTeacher";
    }

    @PostMapping("/add")
    public String addTeacherPost(@ModelAttribute PersonCreationDTO dto) {
        personService.addPerson(dto);
        return "redirect:/index";
    }
}
