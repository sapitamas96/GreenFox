package com.tamas;

public class Car {

    private int gasAmount;
    private int capacity;

    public Car(int gasAmount) {
        if (gasAmount >= 0 && gasAmount <= 100) {
            this.gasAmount = gasAmount;
        }
        this.capacity = 100;
    }

    public int refill() {
        return capacity - gasAmount;
    }


}
