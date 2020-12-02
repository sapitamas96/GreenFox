package com.tamas;

public class SumDigit {

    public static void main(String[] args) {
        // Adott egy nem negatív egész szám n,
        // térj vissza a számjegyei összegével rekurzívan
        // (ciklusok nélkül).
        //
        // Tipp:
        //
        // A 10-zel való osztásnál (% = maradékos osztást használva)
        // a maradékot kapod
        // (pl.: 126 % 10 = 6)
        //
        // A 10-zel való osztásnál (/) maradék nélküli eredményt kapsz
        // (pl.: 126 / 10 = 12).
        System.out.println(sumDigit(126));
        System.out.println(sumDigit(964821));
    }

    public static int sumDigit(int number) {
        return number < 1 ? 0 : number % 10 + sumDigit(number / 10);
    }
}
