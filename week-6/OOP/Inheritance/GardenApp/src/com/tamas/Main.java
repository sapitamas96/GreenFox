package com.tamas;

public class Main {

    public static void main(String[] args) {

        Garden garden = new Garden();
        Flower yellow = new Flower("yellow");
        Flower blue = new Flower("blue");
        Tree purple = new Tree("purple");
        Tree orange = new Tree("orange");

        garden.addPlants(yellow, blue, purple, orange);
        garden.printPlantStatus();
        garden.irrigate(40);
    }
}
