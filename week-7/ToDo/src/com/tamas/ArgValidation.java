package com.tamas;

import java.io.IOException;
import java.util.*;

public class ArgValidation {

    private static ArgValidation single_instance = null;
    private static ArrayList<String> args;
    private static final Map<String, Runnable> COMMANDS = new HashMap<>();
    private static String argFromCmd = null;

    private ArgValidation(String[] args) {
        ArgValidation.args = new ArrayList<>(Arrays.asList(args));
    }

    public static ArgValidation getInstance(String[] args) {
        if (single_instance == null) {
            single_instance = new ArgValidation(args);
        }
        return single_instance;
    }

    static {
        COMMANDS.put("-l", () -> {
            try {
                PrintToDo.print();
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        });
        COMMANDS.put("-a", () -> {
            try {
                AddTask.addTask(argFromCmd);
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        });
        COMMANDS.put("-r", () -> {
            try {
                RemoveTask.removeTask(argFromCmd);
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        });
        COMMANDS.put("-c", () -> {
            try {
                CompleteTask.completeTask(argFromCmd);
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        });
    }

    public static void startApp() {
        if (!args.isEmpty()) {
            String firstArg = args.get(0).toLowerCase();
            if (COMMANDS.containsKey(firstArg)) {
                if (args.size() > 1) {
                    argFromCmd = args.get(1);
                }
                COMMANDS.get(firstArg).run();
            } else {
                System.out.println("Unsupported argument: " + firstArg);
                printCmd();
            }
        } else {
            printCmd();
        }
    }

    private static void printCmd() {
        System.out.println(
                "Command Line Todo application\n" +
                        "=============================\n" +
                        "\n" +
                        "Command line arguments:\n" +
                        "    -l   Lists all the tasks\n" +
                        "    -a   Adds a new task\n" +
                        "    -r   Removes an task\n" +
                        "    -c   Completes an task");
    }
}
