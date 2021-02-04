package com.example.demo.ColoringAround.services;

import org.springframework.stereotype.Service;

@Service
public class GreenColour implements MyColour{

    @Override
    public String printColour() {
        return "This is GREEN!";
    }
}
