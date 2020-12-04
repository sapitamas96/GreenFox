package com.tamas;

public class Plant {

    protected double waterLevel;
    protected String colour;

    public Plant(String colour) {
        this.colour = colour;
        this.waterLevel = 0;
    }

    public double irrigation(int amount) {
        return 0;
    }

    public void status() {
        //Empty
    }

    public boolean isWaterNeeded() {
        return false;
    }




}
