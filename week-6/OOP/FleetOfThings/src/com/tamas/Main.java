package com.tamas;

public class Main {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // - Van egy `Thing` (Dolog) osztályod
        // - Van egy `Fleet` (Flotta) osztályod
        // - Van egy `FleetOfThings` osztályod, amelyben a `main()` metódus kap helyet
        // - Töltsd le és használd ezeket

        // - Érd el a következő kimenetet:
        // 1. [ ] Vásárolj tejet
        // 2. [ ] Hárítsd el az akadályokat
        // 3. [x] Állj fel
        // 4. [x] Edd meg az ebédet

        Thing milk = new Thing("Buy milk");
        fleet.add(milk);

        Thing avert = new Thing("Avert the obstacles");
        fleet.add(avert);

        Thing standUp = new Thing("Stand Up");
        standUp.complete();
        fleet.add(standUp);

        Thing eat = new Thing("Eat you lunch");
        eat.complete();
        fleet.add(eat);

        System.out.println(fleet);
    }
}
