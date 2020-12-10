package com.tamas;

import java.io.IOException;

public class PrintToDo {

    private PrintToDo() {
        //Empty
    }

    static void print() throws IOException {
        if (!MyIO.readFile().isEmpty()) {
            for (String line : MyIO.readFile()) {
                System.out.println(line);
            }
        } else {
            System.out.println("No todos for today! :)");
        }
    }
}
