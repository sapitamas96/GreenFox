package com.company;

import java.util.Scanner;

public class LineCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number!");

        int number = scanner.nextInt();
        int counter = 0;

        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
