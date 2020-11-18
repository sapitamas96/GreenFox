package com.company;

import java.util.ArrayList;

public class ListIntroduction1 {

    public static void main(String[] args) {

        ArrayList<String> testList = new ArrayList<>();

        System.out.println(testList.size());

        testList.add("William");

        System.out.println(testList.isEmpty());

        testList.add("John");
        testList.add("Amanda");

        System.out.println(testList.size());
        System.out.println(testList.get(2));

        for (String name : testList) {
            System.out.println(name);
        }

        testList.remove(1);

        for (int i = testList.size()-1; i >= 0 ; i--) {
            System.out.println(testList.get(i));
        }

        testList.clear();
    }
}
