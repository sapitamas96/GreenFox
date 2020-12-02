package com.tamas;

public class Power {

    public static void main(String[] args) {
        // Adott a "base" és "n" változó, mindkettő értéke legalább 1 vagy magasabb,
        // számold ki rekurzívan (ciklusok nélkül) az értékét:
        // base-nek n-re emelve
        // Tehát, pl.: powerN(3, 2) az 9 (3 a négyzeten).
        System.out.println(power(2, 3));
    }

    public static int power(int base, int n) {
        return n == 0 ? 1 : base * power(base, n -1);
    }
}
