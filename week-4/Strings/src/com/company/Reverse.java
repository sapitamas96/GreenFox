package com.company;

public class Reverse {
    public static void main(String... args){
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Készíts egy függvényt ami megfordít egy Stringet, amit
        // bemeneti paraméterként kap.
        // Használd a függvényt a "toBeReversed" változón ellenőrzésként.
        // Elsőként próbáld megoldani a feladatot a charAt() függvénnyel, majd
        // opcionálisan akárhogy.

        System.out.println(reverse(toBeReversed));
    }

    public static String reverse(String text) {
        StringBuilder str = new StringBuilder(text);
        StringBuilder strReverse = str.reverse();

        return strReverse.toString();
    }
}
