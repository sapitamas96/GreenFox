package com.tamas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Hozz létre egy metódust, ami visszafejti a reversed-lines.txt-t
        System.out.println(reverseString("alma"));
        reverseLinesInFile("src\\com\\tamas\\reversed.txt");
    }

    public static String reverseString(String text) {
        String tmp = "";
        for (int i = text.length()-1; i >= 0; i--) {
            tmp += text.charAt(i);
        }
        return tmp;
    }

    public static void reverseLinesInFile(String path) {
        Path filePath = Paths.get(path);
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size() ; i++) {
                lines.set(i, reverseString(lines.get(i)));
            }
            Files.write(filePath, lines);
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}
