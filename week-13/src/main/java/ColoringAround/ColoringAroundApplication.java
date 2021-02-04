package com.example.demo.ColoringAround;

import com.example.demo.ColoringAround.services.RedColour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoringAroundApplication  implements CommandLineRunner {

    private RedColour red;

    @Autowired
    public ColoringAroundApplication(RedColour red) {
        this.red = red;
    }

    public static void main(String[] args) {
        SpringApplication.run(ColoringAroundApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println(red.printColour());

    }
}
