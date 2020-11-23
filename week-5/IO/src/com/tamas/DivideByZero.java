package com.tamas;

public class DivideByZero {

    public static void main(String[] args) {
        // Készíts egy függvényt, ami kap egy számot,
        // majd elosztja ezzel a számmal a tízet és
        // kiírja az eredményt.
        // Ha a bemeneti paraméter 0, azt írja ki, hogy 'hiba'

        System.out.println(tenDividedBy(2));
        System.out.println(tenDividedBy(0));
    }

    public static double tenDividedBy(int number) {
        try {
            return 10. / number;
        } catch (ArithmeticException e) {
            System.err.println("Error");
        } return -1;
    }
}
