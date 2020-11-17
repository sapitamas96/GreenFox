package com.company;

import java.util.Scanner;

public class DrawingDiamond {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        /** Printing the top of the diamond */
        for (int i = 0; i < number / 2; i++) {
            for (int j = number / 2; j > i; j--) {
                System.out.print(" ");
            }

            for (double k = 0; k <= i && i < number / 2; k += 0.5) {
                System.out.print("*");
            }
            System.out.println("");
        }

        /** Print middle of the diamond */
        if (number % 2 == 1) {
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        /** Print the end of the diamond */
        for (int i = 0; i < number / 2; i++) {
            for (int k = 0; k <= i && i < number / 2; k++) {
                System.out.print(" ");
            }

            for (double j = number / 2; j > (double) i + 0.5; j -= 0.5) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
