package com.company;

import java.util.Arrays;

public class ElemÉrtékemelés {

    public static void main(String[] args) {
        // - Készíts egy `numbers` nevű változót (tömböt)
        //   a következő tartalommal (értékekkel): `[1, 2, 3, 4, 5]`
        // - Növeld a harmadik elem értékét (pl.: eggyel)
        // - Írasd ki a konzolra a `numbers` nevű tömb harmadik elemét

        int[] numbers = {1, 2, 3, 4, 5};

        numbers[2]++;

        System.out.println(Arrays.toString(numbers));
    }
}
