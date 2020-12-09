package com.tamas;

public class Helicopter extends Vehicle implements Flyable {

    public Helicopter(int numberOfSeats, int numberOfDoors, String fuelType) {
        super(numberOfSeats, numberOfDoors, fuelType);
    }

    @Override
    public void land() {
        System.out.println("Helicopter landed!");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter in the air!");
    }

    @Override
    public void takeOff() {
        System.out.println("Helicopter take off!");
    }
}
