package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    private AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/web/greeting", method = RequestMethod.GET)
    public String greeting(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        model.addAttribute("count", counter.incrementAndGet());
        return "greeting";
    }
}
