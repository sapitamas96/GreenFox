package com.example.demo.cotrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebShopController {

    @GetMapping(value = "webShop")
    public String index() {
        return "index";
    }
}
