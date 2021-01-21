package com.greenfoxacademy.springstart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class FizzBuzzWoofController {

    private AtomicLong counter = new AtomicLong();

    private FizzBuzzWoofService fizzBuzzWoofService;

    @Autowired
    public FizzBuzzWoofController(FizzBuzzWoofService fizzBuzzWoofService) {
        this.fizzBuzzWoofService = fizzBuzzWoofService;
    }

    @GetMapping(value = "/fizzBuzz")
    public String fizzBuzz(Model model) {
        counter.incrementAndGet();
        model.addAttribute("count", fizzBuzzWoofService.getFizzBuzzWord(counter.intValue()));
        model.addAttribute("size", fizzBuzzWoofService.getTextSize(counter.intValue()));
        return "fizzBuzzWoof";
    }
}
