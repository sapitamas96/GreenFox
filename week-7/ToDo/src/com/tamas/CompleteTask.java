package com.tamas;

import java.io.IOException;
import java.util.List;

public class CompleteTask {

    private static List<String> toDoTasks = null;

    private CompleteTask() {
        //Empty
    }

    public static void completeTask(String arg) throws IOException {
        toDoTasks = MyIO.readFile();
        if (arg != null) {
            if (toDoTasks.contains(arg)) {
                completeTask(toDoTasks.indexOf(arg));
            }
        }

        if (IsNumeric.isNumeric(arg)) {
            int tmpIndex = Integer.parseInt(arg) - 1;
            if (tmpIndex >= 0 && tmpIndex < toDoTasks.size()) {
                completeTask(tmpIndex);
            }
            System.out.println("Unable to check: index is out of bound");
        } else {
            System.out.println("Unable to check: task do not exists");
        }
    }

    private static void completeTask(int tmpIndex) throws IOException{
        String[] tmpLine = toDoTasks.get(tmpIndex).split("\\[ ]");
        toDoTasks.add(tmpIndex, tmpLine[0] + "[X]" + tmpLine[1]);
        MyIO.writeFile(toDoTasks);
        System.out.println("Task successfully completed!");
    }
}
