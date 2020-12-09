package com.tamas;

public abstract class Vehicle {

    protected int numberOfSeats;
    protected int numberOfDoors;
    protected String fuelType;

    public Vehicle(int numberOfSeats, int numberOfDoors, String fuelType) {
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }
}
