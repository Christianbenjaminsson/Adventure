package com.example.location;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationId;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationId, String description) {
        this.locationId = locationId;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
    }

    public void addExit(int location, String direction) {
        exits.put(direction, location);
    }

    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
