package com.example.usefulutilities.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CheckEmail {

    public boolean isValid(String email) {
        return Arrays.asList(email.split("")).containsAll(Arrays.asList(".", "@"));
    }
}
