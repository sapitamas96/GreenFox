package com.tamas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MyIO {

    private static final Path FILEPATH = Paths.get("TasksToDo.txt");

    private MyIO() {
        //Empty
    }

    public static List<String> readFile() throws IOException {
        return Files.readAllLines(FILEPATH);
    }

    public static void writeFile(List<String> tasksToDo) throws IOException {
        Files.write(FILEPATH, tasksToDo);
    }
}
