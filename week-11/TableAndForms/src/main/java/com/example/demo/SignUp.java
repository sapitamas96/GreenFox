package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUp {

    @GetMapping(value = "/signUp")
    public String signUp() {
        return "signUp";
    }
}
