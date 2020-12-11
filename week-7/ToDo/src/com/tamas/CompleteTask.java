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
            for (String toDoTask : toDoTasks) {
                if (arg.toLowerCase().equals(removePrefix(toDoTask))) {
                    completeTask(toDoTasks.indexOf(toDoTask));
                    return;
                }
            }
        }

        if (IsNumeric.isNumeric(arg)) {
            int tmpIndex = Integer.parseInt(arg) - 1;
            if (tmpIndex >= 0 && tmpIndex < toDoTasks.size()) {
                completeTask(tmpIndex);
            } else {
                System.out.println("Unable to check: index is out of bound");
            }
        } else {
            System.out.println("Unable to check: task do not exists");
        }
    }

    private static void completeTask(int tmpIndex) throws IOException {
        String tmpLine = toDoTasks.get(tmpIndex);
        if (!tmpLine.matches("^[0-9]+ - \\[X].*")) {
            String[] tmpSplitLine = tmpLine.split("\\[ ]");
            toDoTasks.set(tmpIndex, tmpSplitLine[0] + "[X]" + tmpSplitLine[1]);
            MyIO.writeFile(toDoTasks);
            System.out.println("Task successfully completed!");
        } else {
            System.out.println("Task already completed!");
        }
    }

    private static String removePrefix(String line) {
        int index = line.indexOf("]");
        return line.substring(index + 1).trim().toLowerCase();
    }
}
