package com.tamas;

public class Strings {

    public static void main(String[] args) {
        // Adott egy string.
        // Készíts rekurzívan (ciklusok nélkül) egy új stringet, ahol
        // minden kisbetűs 'x' karakter 'y'-ra cserélődik.

        System.out.println(swapX("phxsiologx", 0));
    }

    private static String swapX(String text, int i) {
        if (i == text.length()) return text;
        StringBuilder stb = new StringBuilder(text);
        String tmp = text.charAt(i) == 'x' ? stb.replace(i, i + 1, "y").toString() : text;
        return swapX(tmp, ++i);
    }
}
