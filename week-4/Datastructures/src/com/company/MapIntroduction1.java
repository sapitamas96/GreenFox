package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {

    public static void main(String[] args) {

        HashMap<Integer, String> testMap = new HashMap<>();

        System.out.println(testMap.isEmpty());

        testMap.put(97, "a");
        testMap.put(98, "b");
        testMap.put(99, "c");
        testMap.put(65, "A");
        testMap.put(66, "B");
        testMap.put(67, "C");

        for (int key : testMap.keySet()) {
            System.out.println(key);
        }

        for (String value : testMap.values()) {
            System.out.println(value);
        }

        testMap.put(68, "D");

        System.out.println(testMap.size());
        System.out.println(testMap.get(99));

        testMap.remove(97);

        System.out.println(testMap.containsKey(100));

        for (Map.Entry<Integer, String> entry : testMap.entrySet()) {
            System.out.println(entry);
        }

        testMap.clear();
    }
}
