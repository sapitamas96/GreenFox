package com.company;

import java.util.ArrayList;

public class SearchPalindrome {

    public static void main(String[] args) {
        System.out.println(searchPalindrome("dog goat dad duck doodle never").toString());
    }

    // not working correctly
    public static ArrayList searchPalindrome(String text) {
        String[] array = text.split("");
        ArrayList<String> palindrome = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            int tmp = i;
            while (tmp > 0) {
                if (i + counter < text.length()) {
                    if (array[i - counter].equals(array[i + counter])) {
                        String tmpText = text.substring(i - counter, i + counter +1);
                        if (tmpText.length() >= 3) {
                            palindrome.add(tmpText);
                        }

                        counter++;
                    }
                }
                tmp--;
            }
            counter = 0;
        }
        return palindrome;
    }
}
