package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));
        doWeHave(shoppingList, "milk");
        doWeHave(shoppingList, "banana");
    }

    public static boolean doWeHave(ArrayList<String> list, String item) {
        System.out.println("Do We have " + item + "? " + list.contains(item));
        return list.contains(item);
    }
}
