package com.tamas;

import java.util.ArrayList;
import java.util.List;

public class DiceSet {

    ArrayList<Integer> dice = new ArrayList<>();

    public List<Integer> roll() {
        for (int i = 0; i < 6; i++) {
            dice.add((int) (Math.random() * 6) + 1);
        }
        return dice;
    }

    public List<Integer> getCurrent() {
        return dice;
    }

    public int getCurrent(int i) {
        return dice.get(i);
    }

    public void reroll() {
        for (int i = 0; i < dice.size(); i++) {
            dice.set(i, (int) (Math.random() * 6) + 1);
        }
    }

    public void reroll(int k) {
        dice.set(k, (int) (Math.random() * 6) + 1);
    }

    public static void main(String[] args) {
        // Van egy `DiceSet` osztályod, amely tartalmaz egy listát 6 dobókockával
        // A rendelkezésre álló eszközeid:
        // Mindegyiket egyszerre dobhatod a roll() metódussal
        // A getCurrent() metódussal tudod ellenőrizni az aktuális dobások eredményeit
        // Meg tudsz ismételni egy dobást a reroll() segítségével
        // Érd el azt, hogy minden dobókocka értéke 6 legyen

        DiceSet diceSet = new DiceSet();

        System.out.println(diceSet.roll());
        for (int i = 0; i < 6; i++) {
            while (diceSet.getCurrent(i) != 6) {
                diceSet.reroll(i);
            }
        }
        System.out.println(diceSet.getCurrent());
    }
}
