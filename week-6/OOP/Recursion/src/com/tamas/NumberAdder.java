package com.tamas;

public class NumberAdder {

    public static void main(String[] args) {
        // Írj egy rekurzív függvényt, ami egy paramétert kér: n és
        // összeadja a számokat 1-től n-ig.
        System.out.println(numberAdder(12));
    }

    private static int numberAdder(int n) {
       return n == 1 ? 1 : n + numberAdder(n - 1);
    }
}
