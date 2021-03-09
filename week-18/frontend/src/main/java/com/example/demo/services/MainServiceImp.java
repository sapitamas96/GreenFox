package com.example.demo.services;

import com.example.demo.dto.DoublingDTO;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImp implements MainService {

    public DoublingDTO doubling(Integer input) {
        return new DoublingDTO(input, input * 2);
    }
}
