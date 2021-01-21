package com.greenfoxacademy.springstart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetTheWorldController {


    private final GreetTheWorld greetTheWorld;

    @Autowired
    public GreetTheWorldController(GreetTheWorld greetTheWorld) {
        this.greetTheWorld = greetTheWorld;
    }

    @GetMapping(value = "/web/greetTheWorld/{color}/{size}")
    public String greeting(Model model, @PathVariable String color, @PathVariable String size) {
        model.addAttribute("color", color);
        model.addAttribute("size", size);
        model.addAttribute("hello", greetTheWorld.greeting());
        return "greetTheWorld";
    }

    @GetMapping(value = "/web/greetTheWorld")
    public String greeting2(Model model, @RequestParam String color, @RequestParam String size) {
        model.addAttribute("color", color);
        model.addAttribute("size", size);
        model.addAttribute("hello", greetTheWorld.greeting());
        return "greetTheWorld";
    }
}
