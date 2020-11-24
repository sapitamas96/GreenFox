package com.tamas;

public class Palindrome {

    public static void main(String[] args) {
        //Készíts egy createPalindrome nevű függvényt, kövesd az eddig használt nyelvi stílus útmutatót.
        // A függvények bemeneten fogad egy stringet, készít belőle egy palindrómát és visszaadja azt.

        System.out.println(createPalindrome("apple"));
        System.out.println(createPalindromeByFor("apple"));
    }

    public static String createPalindrome(String text) {
        StringBuilder str = new StringBuilder(text);
        return text + str.reverse();
    }

    public static String createPalindromeByFor(String text) {
        String reverse = "";
        String[] array = text.split("");
        for (int i = array.length-1; i >= 0; i--) {
            reverse += array[i];
        }
        return text + reverse;
    }
}
