package com.tamas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Locations implements Map<Integer, Location> {

    private static Locations single_instance = null;
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void readInLocations() throws IOException {
        try (Scanner scanner = new Scanner(new FileReader("locations.txt"))) {
            while (scanner.hasNext()) {
                scanner.useDelimiter(",");
                int tmpID = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String tmpDescription = scanner.nextLine();
                locations.put(tmpID, new Location(tmpID, tmpDescription, new HashMap<>()));
            }

        }

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("directions.txt")))) {
            while (scanner.hasNext()) {
                String[] array = scanner.nextLine().split(",");
                int tmpLocID = Integer.parseInt(array[0]);
                String tmpDir = array[1];
                int tmpExit = Integer.parseInt(array[2]);
                locations.get(tmpLocID).addExits(tmpDir, tmpExit);
            }
        }
    }

    public static Locations getInstance() {
        if (single_instance == null) {
            single_instance = new Locations();
        }
        return single_instance;
    }

    private Locations() {
        //Empty
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}