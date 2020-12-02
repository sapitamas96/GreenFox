package com.tamas;

import java.util.ArrayList;

public class MaximumFounder {

    public static void main(String[] args) {
        // Írj egy olyan függvényt, ami megtalálja egy tömb legnagyobb elemét rekurziót használva.
        int[] array = new int[] {2, 8, 5, 9, 15, -3, 88, 0, 888, 4, 4};

        System.out.println(findMax(array, 0));
    }

    private static int findMax(int[] array, int i) {
        if (i == array.length) return array[array.length - 1];
        int max = array[i];
        int next = findMax(array, i + 1);
        if (max < next) {
            max = next;
        }
        return max;
    }
}
