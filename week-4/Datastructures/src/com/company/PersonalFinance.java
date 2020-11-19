package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonalFinance {
    public static void main(String[] args) {

        ArrayList<Integer> account = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        System.out.println("Total spendings: " + sumOfSpending(account));
        System.out.println("Greatest expense: " + greatestExpense(account));
        System.out.println("Minimum spending: " + minSpending(account));
        System.out.println("Average spendings: " + average(account));

    }

    public static int sumOfSpending(ArrayList<Integer> account) {
        int sum = 0;
        for (int purchase : account) {
            sum += purchase;
        }
        return sum;
    }

    public static int greatestExpense(ArrayList<Integer> account) {
        int max = Integer.MIN_VALUE;
        for (int purchase : account) {
            if (purchase > max) {
                max = purchase;
            }
        }
        return max;
    }

    public static int minSpending(ArrayList<Integer> account) {
        int min = Integer.MAX_VALUE;
        for (int purchase : account) {
            if (purchase < min) {
                min = purchase;
            }
        }
        return min;
    }

    public static double average(ArrayList<Integer> account) {
        return (double) sumOfSpending(account) / (double) account.size();
    }

}
