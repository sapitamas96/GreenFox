package com.company;

public class MindenElemÖsszege {

    public static void main(String[] args) {
        // - Készíts egy `numbers` nevű változót (tömböt)
        //   a következő tartalommal (értékekkel): `[3, 4, 5, 6, 7]`
        // - Írasd ki a konzolra a `numbers` tömb összes elemének összegét

        int[] numbers = {3, 4, 5, 6, 7};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}
