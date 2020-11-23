package com.tamas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {

    public static void main(String[] args) {
        // Írj egy programot, ami megnyitja a "my-file.txt"-t,
        // aztán kiprinteli minden egyes sorát.
        // Ha a program nem tudja megnyitni a fájlt (mert nem létezik),
        // akkor a következő üzenetet printelje ki: "Unable to read file: my-file.txt"

        try {
            Path filePath = Paths.get("src\\com\\tamas\\my-file.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (NoSuchFileException e) {
            System.err.println("Unable to read file: my-file.txt");
        } catch (IOException e) {
            System.err.println("Not expected error!");
        }

    }
}
