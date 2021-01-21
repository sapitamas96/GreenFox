package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FizzBuzzWoofService {

    public String getFizzBuzzWord(int count) {
        StringBuilder stb = new StringBuilder();

        if (count % 3 == 0) {
            stb.append(" Fizz");
        }
        if (count % 5 == 0) {
            stb.append(" Buzz");
        }
        if (count % 7 == 0) {
            stb.append(" Woof");
        }
        if (stb.toString().isEmpty()) {
            stb.append(" ").append(count);
        }
        return stb.toString();
    }

    public String getTextSize(int count) {
        int fizzBuzzCounter = getFizzBuzzWord(count).trim().split(" ").length;

        if (fizzBuzzCounter == 1) {
            return "24px";
        }
        if (fizzBuzzCounter == 2) {
            return "48px";
        }
        return "72px";
    }
}
