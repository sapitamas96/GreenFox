package com.tamas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Hozz létre egy metódust, ami kiszedi a fájl duplikált karaktereit.
        deleteEverySecondCharacter("src\\com\\tamas\\duplicated-chars.txt");
    }

    public static void deleteEverySecondCharacter(String path) {
        Path filePath = Paths.get(path);
        StringBuilder tmp = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                for (int j = 0; j < lines.get(i).length(); j+=2) {
                    tmp.append(lines.get(i).charAt(j));
                }
                lines.set(i, tmp.toString());
                tmp = new StringBuilder();
            }
            Files.write(filePath, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
