package com.company;

import java.util.Arrays;

public class ElemekCseréje {

    public static void main(String[] args) {
        // - Készíts egy `orders` nevű változót (tömböt)
        //   a következő tartalommal (értékekkel): `["first", "second", "third"]`
        // - Cseréld fel az első és a harmadik elemet az `orders` tömbben

        String[] orders = {"first", "second", "third"};

        String tmp = orders[0];

        orders[0] = orders[2];
        orders[2] = tmp;

        System.out.println(Arrays.toString(orders));
    }
}
