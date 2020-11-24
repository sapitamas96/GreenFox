package com.tamas;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {

    public static void main(String[] args) {
        // Készíts egy függvényt, ami 3 paramétert vár: egy elérési utat, egy szót
        // és egy számot. Tudjon írni fájlba.
        // Az elérési út legyen egy string, ami leírja az írandó fájl helyét.
        // A szó szintén legyen string és kerüljön be a fájlba egyenként külön sorba.
        // A szám paraméter jelöli, hogy hány sora legyen a fájnak.
        // Ha a szó 'alma' és a szám 5, akkor 5 sort írjon a fájlba
        // és minden sorban az legyen írva: 'alma'.
        // Ha a függvény nem tud írni a fájlba, ne dobjon semmilyen hibaüzenetet.


        try {
            writeInFile("src\\com\\tamas\\my-file.txt", "alma", 5);
        } catch (NoSuchFileException e) {
            System.err.println("Unable to write file: my-file.txt");
        } catch (IOException e) {
            System.err.println("Unexpected error!");
        }
    }

    public static void writeInFile(String path, String text, int times) throws IOException{
        Path filePath = Paths.get(path);
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            lines.add(text);
        }
        Files.write(filePath, lines, StandardOpenOption.APPEND);
    }
}
