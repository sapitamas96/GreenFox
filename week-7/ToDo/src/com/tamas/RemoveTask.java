package com.tamas;

import java.io.IOException;
import java.util.List;

public class RemoveTask {

    private RemoveTask() {
        //Empty
    }

    public static void removeTask(String arg) throws IOException {
        List<String> toDoTasks = MyIO.readFile();
        if (IsNumeric.isNumeric(arg)) {
            int tmpIndex = Integer.parseInt(arg) - 1;
            if (tmpIndex >= 0 && tmpIndex < toDoTasks.size()) {
                toDoTasks.remove(tmpIndex);
                MyIO.writeFile(toDoTasks);
                System.out.println("Task successfully removed!");
            } else {
                System.out.println("Unable to remove: no index provided");
            }
        } else {
            System.out.println("Please enter index numbers");
        }
    }
}
