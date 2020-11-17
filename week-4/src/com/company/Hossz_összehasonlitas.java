package com.company;

public class Hossz_összehasonlitas {
    public static void main(String[] args) {

        // - Készíts egy `firstArrayOfNumbers` nevű változót (tömböt)
        //   a következő tartalommal (értékekkel): `[1, 2, 3]`
        // - Készíts egy `secondArrayOfNumbers` nevű változót (tömböt)
        //   a következő tartalommal (értékekkel): `[4, 5]`
        // - Írasd ki a konzolra, hogy "A secondArrayOfNumbers hosszabb", ha
        //   `secondArrayOfNumbers` több elemet tartalmaz, mint az `firstArrayOfNumbers`

        int[] firstArrayOfNumbers = {1, 2, 3};
        int[] secondArrayOfNumbers = {4, 5};

        if (secondArrayOfNumbers.length > firstArrayOfNumbers.length) {
            System.out.println("\"secondArrayOfNumbers\" hosszabb");
        }
    }
}
