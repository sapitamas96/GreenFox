package com.tamas;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean checkAnagram(String word1, String word2) {
        word1 = word1.replaceAll(" ","");
        word2 = word2.replaceAll(" ","");
        System.out.println(word1);
        System.out.println(word2);
        List<String> word1List = Arrays.asList(word1.toLowerCase().split(""));
        List<String> word2List = Arrays.asList(word2.toLowerCase().split(""));
        Collections.sort(word1List);
        Collections.sort(word2List);
        System.out.println(word1List);
        System.out.println(word2List);
        return word1List.equals(word2List);
    }
}
