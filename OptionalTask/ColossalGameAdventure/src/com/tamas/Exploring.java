package com.tamas;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exploring {

    private static Scanner scanner = new Scanner(System.in);
    private static Locations locations = Locations.getInstance();
    private static Map<String, String> vocabulary = new HashMap<>();

    static {
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");
    }

    public static void startExploring() throws IOException {
        Locations.readInLocations();
        int loc = 1;

        while (true) {
            System.out.println(locations.get(loc).getLocationDescription());
            if (loc == 0) break;

            Map<String, Integer> exits = locations.get(loc).getExits();
            printExits(exits);

            String tmpExit = scanner.nextLine().toUpperCase();
            if (tmpExit.length() > 1) {
                String[] array = tmpExit.split(" ");
                for (String exit : array) {
                    if (vocabulary.containsKey(exit)) {
                        loc = exits.get(vocabulary.get(exit));
                    }
                }
            }else if (exits.containsKey(tmpExit)) {
                loc = exits.get(tmpExit);
            } else {
                System.out.println("No such exit!");
            }
        }
        scanner.close();
    }

    private static void printExits(Map<String, Integer> exits) {
        System.out.print("Available exits: ");
        for (String exit : exits.keySet()) {
            System.out.print(exit  + " ");
        }
        System.out.println();
    }
}
