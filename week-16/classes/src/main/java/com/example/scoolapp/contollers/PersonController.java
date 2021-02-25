package com.example.scoolapp.contollers;

import com.example.scoolapp.dto.PersonCreationDTO;
import com.example.scoolapp.modells.Person;
import com.example.scoolapp.modells.Role;
import com.example.scoolapp.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/add")
    public String addPerson(Model model) {
        model.addAttribute("roles", Role.values());
        return "addPerson";
    }

    @PostMapping("/add")
    public String addPersonPost(@ModelAttribute PersonCreationDTO dto) {
        Person person = personService.addPerson(dto);
        return "redirect:/index?id=" + person.getId();
    }

    @GetMapping("/list")
    public String listOfPersons(Model model) {
        model.addAttribute("persons", personService.getListOfPersons());
        return "listOfPersons";
    }
}
