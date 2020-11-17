package com.company;

import java.util.Arrays;

public class ListaElemekVisszafelé {

    public static void main(String[] args) {
        // - Készíts egy `numbers` nevű változót (tömböt)
        //   a következő tartalommal (értékekkel): `[4, 5, 6, 7]`
        // - Fordítsd meg az elemek sorrendjét a `numbers` tömbben
        // - Írasd ki a konzolra a `numbers` tömb megfordított sorrendű elemeit

        int[] numbers = {4, 5, 6, 7};
        int count = numbers.length-1;
        int tmp;

        for (int i = 0; i < numbers.length/2; i++) {
            tmp = numbers[i];
            numbers[i] = numbers[count];
            numbers[count] = tmp;
            count--;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
