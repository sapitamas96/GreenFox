package com.tamas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Hozz létre egy metódust, ami visszafejti a reverse-ordet.txt-t
        reverseOrderInFile("src\\com\\tamas\\reverse-order.txt");
    }

    public static void reverseOrderInFile(String path) {
        Path filePath = Paths.get(path);
        try {
            List<String> lines = Files.readAllLines(filePath);
            ArrayList<String> reversed = new ArrayList<>(lines);
            int counter = 0;
            for (int i = lines.size()-1; i >= 0; i--) {
                reversed.set(counter, lines.get(i));
                counter++;
            }
            Files.write(filePath, reversed);
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}
