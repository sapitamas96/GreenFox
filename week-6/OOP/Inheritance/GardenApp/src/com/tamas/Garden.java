package com.tamas;

import java.util.ArrayList;
import java.util.Arrays;

public class Garden {

    private ArrayList<Plant> plants = new ArrayList<>();

    public void addPlants(Plant... plant) {
        this.plants.addAll(Arrays.asList(plant));
    }

    public void printPlantStatus() {
        for (Plant plant : plants) {
            plant.status();
        }
    }

    public void irrigate(int amount) {
        System.out.println("Irrigation with " + amount + " L");
        if (howManyNeedsWater() > 0) {
            int tmpAmount = amount / howManyNeedsWater();
            for (Plant plant : plants) {
                if (plant.isWaterNeeded()) {
                    plant.irrigation(tmpAmount);
                }
            }
        }
        printPlantStatus();
    }

    public int howManyNeedsWater() {
        int counter = 0;
        for (Plant plant : plants) {
            if (plant.isWaterNeeded()) {
                counter++;
            }
        }
        return counter;
    }



}
