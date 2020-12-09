package com.tamas;

public class Main {

    public static void main(String[] args) {
        Helicopter helicopter = new Helicopter(4, 2, "Kerosene");

        helicopter.takeOff();
        helicopter.fly();
        helicopter.land();
    }
}
