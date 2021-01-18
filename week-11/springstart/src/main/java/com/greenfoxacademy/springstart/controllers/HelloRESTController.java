package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    private AtomicLong counter = new AtomicLong();

    @RequestMapping(path = "/greeting")
    public Greetings greeting() {
        return new Greetings(1, "something");
    }

    @RequestMapping(path = "/greetingYou")
    public Greetings greetingYou(@RequestParam String name) {
        return new Greetings(1, "Hello, " + name);
    }

    @RequestMapping(path = "/greetingYouWithCounter")
    public Greetings greetingYouWithCounter(@RequestParam String name) {
        return new Greetings(counter.incrementAndGet(),"Hello, " + name);
    }
}
