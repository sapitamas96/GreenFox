package com.tamas;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {

    public static void main(String[] args) {
        // Hozz létre egy függvényt, ami képes fájlokat mainpulálni:
        // a fájlba beleírja a nevedet, egy sorba.
        // A fájlnak a neve "my-file.txt" legyen.
        // Ha a program nem tudja megnyitni a fájlt,
        // akkor a következő üzenetet kell kiírnia: "Unable to write file: my-file.txt"

        writeInFile("valami", "src\\com\\tamas\\my-file.txt");
        writeInFile("valami", "file.txt");
    }

    public static void writeInFile(String text, String path) {
        Path filePath = Paths.get(path);
        List<String> lines = new ArrayList<>();
        lines.add(text);
        try {
            Files.write(filePath, lines, StandardOpenOption.APPEND);

        } catch (NoSuchFileException e) {
            System.err.println("Unable to write file: " + filePath.getFileName());
        } catch (IOException e) {
            System.err.println("Unexpected error!");
        }
    }
}
