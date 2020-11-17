package com.company;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        // - Készíts (dinamikusan*) egy kétdimenziós tömböt
        //   a következő mátrix-szal**. Ciklust (loop-ot) használj!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Írasd ki a konzolra ezt a kétdimenziós tömböt
        // * A tömb hossza egy változótól kell függjön
        // ** Nyugalom, egy mátrix pont olyan, mint egy tömb

        Scanner scanner = new Scanner(System.in);

        int tmp = scanner.nextInt();

        int[][] matrix = new int[tmp][tmp];

        for (int i = 0; i < tmp ; i++) {
            matrix[i][i]++;
        }

        for (int[] innerArray : matrix) {
            for (int number : innerArray) {
                System.out.print(number + " ");
            }
            System.out.println("");
        }
    }
}
