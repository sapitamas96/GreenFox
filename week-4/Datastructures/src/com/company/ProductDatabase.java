package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {

    final static HashMap<String, Integer> productDatabase = new HashMap<>();

    public static void main(String[] args) {

        productDatabase.put("Eggs", 200);
        productDatabase.put("Milk", 200);
        productDatabase.put("Fish", 400);
        productDatabase.put("Apples", 150);
        productDatabase.put("Bread", 50);
        productDatabase.put("Chicken", 550);

        getPrice("Fish");
        mostExpensive();
        averagePrice();
        numberOfItemsUnder(300);
        doWeHaveFor(125);
        cheapest();
        findByPrice(201, -1);
        findByPrice(150, 1);
    }

    public static int getPrice(String item) {
        int price = productDatabase.get(item);
        System.out.println("Item: " + item + " Price: " + price);
        return price;
    }

    public static Map.Entry<String, Integer> mostExpensive() {
        int max = Integer.MIN_VALUE;
        Map.Entry<String, Integer> tmpEntry = null;
        for (Map.Entry<String, Integer> entry : productDatabase.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                tmpEntry = entry;
            }
        }
        System.out.println("The most expensive item is: " + tmpEntry.getKey() + " for " + tmpEntry.getValue());
        return tmpEntry;
    }

    public static Map.Entry<String, Integer> cheapest() {
        int min = Integer.MAX_VALUE;
        Map.Entry<String, Integer> tmpEntry = null;
        for (Map.Entry<String, Integer> entry : productDatabase.entrySet()) {
            if (entry.getValue() < min) {
                min = entry.getValue();
                tmpEntry = entry;
            }
        }
        System.out.println("The cheapest item is: " + tmpEntry.getKey() + " for " + tmpEntry.getValue());
        return tmpEntry;
    }

    public static int averagePrice() {
        int sum = 0;
        for (int price : productDatabase.values()) {
            sum += price;
        }
        int avg = sum / productDatabase.size();
        System.out.println("The average price is: " + avg);
        return avg;
    }

    public static int numberOfItemsUnder(int price) {
        int counter = 0;
        for (int value : productDatabase.values()) {
            if (value < price) {
                counter++;
            }
        }
        System.out.println("We have " + counter + " items under " + price);
        return counter;
    }

    public static boolean doWeHaveFor(int price) {
        boolean flag = false;
        for (Map.Entry<String, Integer> entry : productDatabase.entrySet()) {
            if (entry.getValue() == price) {
                System.out.println("Item found: " + entry.getKey() + " Price: " + entry.getValue());
                flag = true;
            }
        }
        System.out.println(!flag ? "Item was not found!" : "");
        return flag;
    }

    /**
     * Find items by price range.
     * @param price The target price.
     * @param range
     * Price ranges finds if:
     *      range = 0
     *          - entries' price equal to target price
     *      range > 0
     *          - entries how's price is over the target price
     *      range < 0
     *          - entries how's price is under the target price
     * @return Returns ArrayList with the found items determined by range.
     */
    public static ArrayList<String> findByPrice(int price, int range) {
        ArrayList<String> foundItems = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : productDatabase.entrySet()) {
                if (range == 0 && price == entry.getValue()) {
                    foundItems.add(entry.getKey());
                } else if (range > 0 && price < entry.getValue()) {
                    foundItems.add(entry.getKey());
                } else if (range < 0 && price > entry.getValue()) {
                    foundItems.add(entry.getKey());
                }
            }
        System.out.println(foundItems);
        return foundItems;
    }




}
