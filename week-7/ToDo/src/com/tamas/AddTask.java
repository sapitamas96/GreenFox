package com.tamas;

import java.io.IOException;
import java.util.List;

public class AddTask {

    private AddTask() {
        //Empty
    }

    public static void addTask(String arg) throws IOException {
        List<String> toDoTasks = MyIO.readFile();
        if (arg != null) {
            toDoTasks.add(toDoTasks.size() + 1 + " - [ ] " + arg);
            MyIO.writeFile(toDoTasks);
            System.out.println("Task successfully added!");
        } else {
            System.out.println("Unable to add: no task provided");
        }
    }
}