package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(13+22);

        System.out.println(13-22);

        System.out.println(13*22);

        System.out.println(13. / 22.);

        System.out.println(13/22);

        System.out.println(13%22);

        System.out.println(Arrays.toString(array(1, 2, 3, 4, 5, 6)));

    }

    public static int[] array(int... numbers) {
        int[] array = numbers;
        return array;
    }
}
