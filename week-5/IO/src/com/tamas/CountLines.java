package com.tamas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

    public static void main(String[] args) {

        System.out.println(numberOfLines("src\\com\\tamas\\my-file.txt"));
    }

    public static int numberOfLines(String path) {
        try {
            Path filePath = Paths.get(path);
            List<String> lines = Files.readAllLines(filePath);
            return lines.size();
        } catch (IOException e) {
            return 0;
        }
    }
}
