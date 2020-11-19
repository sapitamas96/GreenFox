package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {

    public static void main(String[] args) {

        HashMap<String, String> testMap = new HashMap<>();

        testMap.put("978-1-60309-452-8", "A Letter to Jo");
        testMap.put("978-1-60309-459-7", "Lupus");
        testMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        testMap.put("978-1-60309-461-0", "The Lab");

        for (Map.Entry entry : testMap.entrySet()) {
            System.out.println(entry.getValue() + " (ISBN: " + entry.getKey() + ")");
        }

        testMap.remove("978-1-60309-444-3");
        testMap.remove("978-1-60309-461-0", "The Lab");

        testMap.put("978-1-60309-450-4", "They Called Us Enemy");
        testMap.put("978-1-60309-453-5", "Why Did We Trust Him?");

        System.out.println(testMap.containsKey("478-0-61159-424-8"));

        System.out.println(testMap.get("978-1-60309-453-5"));
    }
}
