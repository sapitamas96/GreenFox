package com.example.demo.controllers;

import com.example.demo.dto.Doubling;
import com.example.demo.dto.DoublingException;
import com.example.demo.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {

    private MainService mainService;

    @Autowired
    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/")
    public String index() {
        return "index.hu";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public Doubling doubling(@RequestParam(required = false) Integer input) {
        if (input == null) {
            return new DoublingException("Please provide an input!");
        }
        return mainService.doubling(input);
    }

    @GetMapping("/greeter")
    @ResponseBody
    public Map<String, String> greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        HashMap<String, String> tmp = new HashMap<>();
        if (name == null && title == null) {
            tmp.put("error", "Please provide a name and a title!");
            return tmp;
        }
        if (name == null) {
            tmp.put("error", "Please provide a name!");
            return tmp;
        }
        if (title == null) {
            tmp.put("error", "Please provide a title!");
            return tmp;
        }
        tmp.put("welcome_message", "Oh, hi there " + name + ", my dear " + title + "!");
        return tmp;
    }

    @GetMapping("/appenda/{appendable}")
    @ResponseBody
    public Map<String, String> appendA(@PathVariable(required = false) String appendable) {
        if (appendable == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        Map<String, String> tmp = new HashMap<>();
        tmp.put("appended", appendable + "a");
        return tmp;
    }

}
