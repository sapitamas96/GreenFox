package com.tamas;

import java.util.ArrayList;

public class Palindrome {

    public static void main(String[] args) {
        //Készíts egy createPalindrome nevű függvényt, kövesd az eddig használt nyelvi stílus útmutatót.
        // A függvények bemeneten fogad egy stringet, készít belőle egy palindrómát és visszaadja azt.

        System.out.println(createPalindrome("apple"));
        System.out.println(createPalindromeByFor("apple"));

        //Készíts egy searchPalindrome nevű függvényt, ami követi a jelenlegi nyelv stílus útmutatóját.
        // Bemeneten fogad egy stringet.
        // Majd kikeresi, hogy taláhatóak-e 3 karakternél hoszabb palindrómák benne és végül visszaküldi a talált palindrómák listáját.
        System.out.println(searchPalindrome("dog goat dad duck doodle never"));
    }

    public static String createPalindrome(String text) {
        StringBuilder str = new StringBuilder(text);
        return text + str.reverse();
    }

    public static String createPalindromeByFor(String text) {
        String reverse = "";
        for (int i = text.length()-1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        return text + reverse;
    }

    public static ArrayList<String> searchPalindrome(String text) {
        ArrayList<String> palindromes = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 3; j < text.length() - i; j++) {
                String checkPalindrome = text.substring(i, i + j);
                if (isPalindrome(checkPalindrome)) {
                    palindromes.add(checkPalindrome);
                }
            }
        }
        
        return palindromes;
    }

    public static boolean isPalindrome(String text) {
        StringBuilder str = new StringBuilder(text);
        return str.reverse().toString().equals(text);
    }
}
