package com.tamas;

public class Flower extends Plant{


    public Flower(String colour) {
        super(colour);
    }

    @Override
    public double irrigation(int amount) {
        return this.waterLevel = amount * 0.75;
    }

    @Override
    public void status() {
        if (isWaterNeeded()) {
            System.out.println("The "+ super.colour + " " + Flower.class.getSimpleName() + " needs water");
        } else {
            System.out.println("The "+ super.colour + " " + Flower.class.getSimpleName() + " doesn't  need water");
        }
    }

    @Override
    public boolean isWaterNeeded() {
        return super.waterLevel < 5;
    }
}
