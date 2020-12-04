package com.tamas;

public class Tree extends Plant {


    public Tree(String colour) {
        super(colour);
    }

    @Override
    public double irrigation(int amount) {
        return this.waterLevel = amount * 0.4;
    }

    @Override
    public void status() {
        if (isWaterNeeded()) {
            System.out.println("The "+ super.colour + " " + Tree.class.getSimpleName() + " needs water");
        } else {
            System.out.println("The "+ super.colour + " " + Tree.class.getSimpleName() + " doesn't  need water");
        }
    }

    @Override
    public boolean isWaterNeeded() {
        return super.waterLevel < 10;
    }
}
