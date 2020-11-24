package com.tamas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {

    public static void main(String[] args) {
        // Írj egy függvényt, ami átmásolja egy fájl tartalmát egy másikba
        // A két fájl nevét paraméterként kapja meg
        // És visszaad egy boolean értéket, attól függően,
        // hogy sikeres volt-e a másolás

        copyFile("src\\com\\tamas\\my-file.txt", "src\\com\\tamas\\new-file.txt");
    }

    public static boolean copyFile(String copyFrom, String copyTo) {
        Path filePathFrom = Paths.get(copyFrom);
        Path filePathTo = Paths.get(copyTo);
        try {
            List<String> lines = Files.readAllLines(filePathFrom);
            Files.write(filePathTo, lines);
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}
