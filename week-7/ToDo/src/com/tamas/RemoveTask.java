package com.tamas;

import java.io.IOException;
import java.util.List;

public class RemoveTask {

    private static List<String> toDoTasks = null;

    private RemoveTask() {
        //Empty
    }

    public static void removeTask(String arg) throws IOException {
        toDoTasks = MyIO.readFile();
        if (IsNumeric.isNumeric(arg)) {
            int tmpIndex = Integer.parseInt(arg) - 1;
            if (tmpIndex >= 0 && tmpIndex < toDoTasks.size()) {
                toDoTasks.remove(tmpIndex);
                newIndex();
                MyIO.writeFile(toDoTasks);
                System.out.println("Task successfully removed!");
            } else {
                System.out.println("Unable to remove: index is out of bound");
            }
        } else {
            System.out.println("Please enter index numbers");
        }
    }

    private static String removePrefix(String line) {
        int index = line.indexOf("-");
        return line.substring(index).trim().toLowerCase();
    }

    private static void newIndex() {
        for (int i = 0; i < toDoTasks.size(); i++) {
            toDoTasks.set(i, (i + 1) + " " + removePrefix(toDoTasks.get(i)));
        }
    }
}
