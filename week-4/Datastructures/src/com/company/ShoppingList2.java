package com.company;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {

    final static HashMap<String, Double> shoppingList = new HashMap<>();

    public static void main(String[] args) {

        shoppingList.put("Milk", 1.07);
        shoppingList.put("Rice", 1.59);
        shoppingList.put("Eggs", 3.14);
        shoppingList.put("Cheese", 12.60);
        shoppingList.put("Chicken Breasts", 9.40);
        shoppingList.put("Apples", 2.31);
        shoppingList.put("Tomato", 2.58);
        shoppingList.put("Potato", 1.75);
        shoppingList.put("Onion", 1.10);

        HashMap<String, Integer> bobsList = new HashMap<>();

        bobsList.put("Milk", 3);
        bobsList.put("Rice", 2);
        bobsList.put("Eggs", 2);
        bobsList.put("Cheese", 1);
        bobsList.put("Chicken Breasts", 4);
        bobsList.put("Apples", 1);
        bobsList.put("Tomato", 2);
        bobsList.put("Potato", 1);

        HashMap<String, Integer> aliceList = new HashMap<>();

        aliceList.put("Rice", 1);
        aliceList.put("Eggs", 5);
        aliceList.put("Chicken Breasts", 2);
        aliceList.put("Apples", 1);
        aliceList.put("Tomato", 10);

        checkOut(bobsList);
        checkOut(aliceList);
    }

    public static double checkOut(HashMap<String, Integer> costumer) {
        double sum = 0;
        for (Map.Entry<String, Integer> entry : costumer.entrySet()) {
            if (shoppingList.containsKey(entry.getKey())) {
                sum += shoppingList.get(entry.getKey()) * entry.getValue();
            }
        }
        System.out.println("Total price: " + sum);
        return sum;
    }

}
