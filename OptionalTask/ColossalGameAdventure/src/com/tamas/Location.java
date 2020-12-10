package com.tamas;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private int locationID;
    private String locationDescription;
    private Map<String, Integer> exits;

    public Location(int locationID, String locationDescription, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.locationDescription = locationDescription;

        if (exits == null) {
            this.exits = new HashMap<>();
        } else {
            this.exits = new HashMap<>(exits);
        }
        this.exits.put("Q", 0);
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(this.exits);
    }

    public void addExits(String direction, int locationID) {
        this.exits.put(direction, locationID);
    }
}
