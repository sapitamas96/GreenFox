package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {

    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        ArrayList<String> listB = new ArrayList<>(listA);

        System.out.println(listA.contains("Durian"));

        listB.remove("Durian");
        listA.add(3, "Kivifruit");

        System.out.println(listA.size() == listB.size());
        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));

        listB.add("Passion Fruit");
        listB.add("Pomelo");

        System.out.println(listA.get(2));

    }
}
