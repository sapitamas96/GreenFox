package com.example.usefulutilities.controllers;

import com.example.usefulutilities.services.CheckEmail;
import com.example.usefulutilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulController {

    UtilityService utilityService;
    CheckEmail checkEmail;

    @Autowired
    public UsefulController(UtilityService utilityService, CheckEmail checkEmail) {
        this.utilityService = utilityService;
        this.checkEmail = checkEmail;
    }

    @GetMapping("/useful")
    public String getIndex() {
        return "index";
    }

    @GetMapping("useful/colored")
    public String getColored(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }

    @GetMapping("/useful/email")
    public String getEmail(@RequestParam String email, Model model) {
        model.addAttribute("isValid", checkEmail.isValid(email));
        model.addAttribute("email", email);
        return "checkEmail";
    }
}
