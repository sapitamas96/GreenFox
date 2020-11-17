package com.company;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Módosítsd úgy ezt a programot, hogy a felhasználót üdvözölje
        // a Világ helyett.
        // A program kérje a felhasználó nevét
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, " + scanner.nextLine() + "!");

    }
}