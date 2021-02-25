package com.example.scoolapp.contollers;

import com.example.scoolapp.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private PersonService personService;

    @Autowired
    public MainController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/index")
    public String index(@RequestParam(required = false) Long id, Model model) {
        if (id == null) {
            return "/index";
        }
        model.addAttribute("person", personService.getPersonById(id));
        return "index";
    }
}
